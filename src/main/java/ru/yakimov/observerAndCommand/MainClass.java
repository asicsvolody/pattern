package ru.yakimov.observerAndCommand;

/**
 * Created by Vladimir Yakimov.
 * e-mail: VYakimov@elar.ru
 */

public class MainClass {

    public static void main(String[] args) {

        Executor executor = new Executor();

        Waiter waiterOne = new Waiter();

        waiterOne.setWorkflow(
                () -> {
                    System.out.println("Workflow one in fork");
                    try {
                        Thread.sleep(4000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    return true;
                }
        );

        Waiter waiterTwo = new Waiter();

        waiterTwo.setWorkflow(
                () -> {

                    System.out.println("Workflow two in fork");
                    try {
                        Thread.sleep(4000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    return true;
                }
        );


        new Observer(executor, waiterOne, waiterTwo)
                .observe();



    }
}
