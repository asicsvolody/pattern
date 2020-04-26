package ru.yakimov.proxyAndDecorator;

/**
 * Created by IntelliJ Idea.
 * User: Якимов В.Н.
 * E-mail: yakimovvn@bk.ru
 */

public class WorkflowProxyAndDecorator {
    private IWorkflow workflow;

    public WorkflowProxyAndDecorator(IWorkflow workflow) {
        this.workflow = workflow;
    }

    public void startWorkflowWithLogs(){
        System.out.println("Start!");
        workflow.startWork();
        System.out.println("Finish!");
    }


    public static void main(String[] args) {
        new WorkflowProxyAndDecorator(new Workflow()).startWorkflowWithLogs();
    }


}
