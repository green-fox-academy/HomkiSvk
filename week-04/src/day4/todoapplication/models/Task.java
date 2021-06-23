package day4.todoapplication.models;

public class Task {

    private final String description;
    private boolean isDone;

    public Task(String description) {
        this.description = description;
        this.isDone = false;
    }

    public String getDescription() {
        return description;
    }

    public void completeTask() {
        this.isDone = true;
    }

    @Override
    public String toString() {
        return (isDone ? "[x] " : "[ ] ") + description;
    }



}


