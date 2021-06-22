package day2.comparable;

public class Thing implements Comparable<Thing> {
    private final String name;
    private boolean completed;

    public Thing(String name) {
        this.name = name;
    }

    public void complete() {
        this.completed = true;
    }

    @Override
    public String toString() {
        return (completed ? "[x] " : "[ ] ") + name;
    }

    @Override
    public int compareTo(Thing o) {
        int result = Boolean.compare(o.completed, this.completed);
        if (result == 0)
            return (this.name.compareTo(o.name));
        return result;
    }
}