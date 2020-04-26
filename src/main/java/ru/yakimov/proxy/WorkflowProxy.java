package ru.yakimov.proxy;

import java.util.logging.Logger;

/**
 * Created by IntelliJ Idea.
 * User: Якимов В.Н.
 * E-mail: yakimovvn@bk.ru
 */

public class WorkflowProxy {
    private IWorkflow workflow;

    public WorkflowProxy(IWorkflow workflow) {
        this.workflow = workflow;
    }

    public void startWorkflowWithLogs(){
        System.out.println("Start!");
        workflow.startWork();
        System.out.println("Finish!");
    }


    public static void main(String[] args) {
        new WorkflowProxy(new Workflow()).startWorkflowWithLogs();
    }


}
