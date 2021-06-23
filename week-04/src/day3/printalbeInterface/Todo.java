package day3.printalbeInterface;

public class Todo implements Printable {

    private final String task;
    private final String priority;
    private boolean done;

    public Todo(String task, String priority) {
        this.task = task;
        this.priority = priority;
        this.done = false;
    }

    public void doTheTask() {
        this.done = true;
    }

    @Override
    public void printAllFields() {
        System.out.println("Task: " + this.task + " | Priority: " + this.priority + " |  Done: " + this.done);
    }
}
