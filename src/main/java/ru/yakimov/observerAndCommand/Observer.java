package ru.yakimov.observerAndCommand;

import java.util.*;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * Created by Vladimir Yakimov.
 * e-mail: VYakimov@elar.ru
 */

public class Observer {
    private final Executor executor;

    private final List<Waiter> waiterList = new ArrayList<>();

    private final Queue<IWorkflow> queue = new ConcurrentLinkedQueue<>();

    public Observer(Executor executor, Waiter ... waiters){
        this.executor = executor;
        Collections.addAll(waiterList, waiters);
        checkWaiterList();
    }

    private void checkWaiterList(){
        for (Waiter waiter : waiterList) {
            if(waiter.hasNewWork()){
                queue.add(waiter.takeWorkflow());
            }
        }
    }

    public void observe(){

        while(true){


            if(!executor.isFree() || queue.isEmpty())
                continue;

            executor.execute(
                    queue.poll()
            );
            checkWaiterList();

        }
    }

}
