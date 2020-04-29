package ru.yakimov.mediator;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * Created by Vladimir Yakimov.
 * e-mail: VYakimov@elar.ru
 */

public class Mediator {
    private IReider reider;
    private IWriter writer;

    public Mediator (IReider reider, IWriter writer){
        this.reider = reider;
        this.writer = writer;
    }

    public void conveyor() throws Exception {
        reider.openSource();
        while(true){
            String str = reider.read();
            if (str.equals("exit")){
                writer.write("Buy!!!");
                reider.closeSource();
                return;
            }
            writer.write("msg: " + str);


        }
    }

    public static void main(String[] args) throws Exception {
        new Mediator(
                new Reader(),
                new Writer()
        ).conveyor();
    }


}
