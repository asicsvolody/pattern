package ru.yakimov.observerAndCommand;

/**
 * Created by Vladimir Yakimov.
 * e-mail: VYakimov@elar.ru
 */

public class Waiter {

    private IWorkflow workflow = null;
    private boolean inQueue = false;

    public boolean hasNewWork(){
        return !inQueue && workflow != null;
    };

    public void setWorkflow(IWorkflow workflow) {
        this.inQueue = false;
        this.workflow = workflow;
    }

    public IWorkflow takeWorkflow(){
        IWorkflow myWorkflow = this.workflow;
        this.workflow = null;
        this.inQueue = true;
        return myWorkflow;
    }
}
