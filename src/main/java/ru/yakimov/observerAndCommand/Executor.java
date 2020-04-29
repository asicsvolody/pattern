package ru.yakimov.observerAndCommand;

/**
 * Created by Vladimir Yakimov.
 * e-mail: VYakimov@elar.ru
 */

public class Executor {

    private boolean isFree = true;


    public void execute(IWorkflow workflow){
        this.isFree = false;
        workflow.work();
        this.isFree = true;
    }

    public boolean isFree() {
        return this.isFree;
    }
}
