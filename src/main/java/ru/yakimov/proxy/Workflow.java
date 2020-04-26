package ru.yakimov.proxy;

/**
 * Created by IntelliJ Idea.
 * User: Якимов В.Н.
 * E-mail: yakimovvn@bk.ru
 */

public class Workflow implements IWorkflow {

    @Override
    public void startWork() {
        System.out.println("My workflow process in work");
    }
}
