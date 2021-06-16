public class Counter {

    private int counter = 0;
    private int initialCounterValue = 0;

    public Counter() {
    }

    public Counter(int counter) {
        this.counter = counter;
        this.initialCounterValue = counter;
    }

    public void add() {
        this.counter++;
    }

    public int get() {
        return counter;
    }

    public void add(int number) {
        this.counter += number;
    }

    public void reset() {
        this.counter = initialCounterValue;
    }


}
