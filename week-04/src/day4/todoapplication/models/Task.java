package day4.todoapplication.models;

public class Task {

    private final String description;
    private boolean isDone;

    public Task(String description, String isDone) {
        this.description = description;
        this.isDone = Boolean.parseBoolean(isDone);
    }

    public String getDescription() {
        return description;
    }

    public void setDone(boolean done) {
        isDone = done;
    }

    public boolean isDone() {
        return isDone;
    }

    @Override
    public String toString() {
        return (isDone ? "[x] " : "[ ] ") + description;
    }


}


