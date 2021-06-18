package sum;

public class Sum {

    public int sumThemAll(int[] toSum) {
        int summary = 0;
        for (int number : toSum) {
            summary += number;
        }
        return summary;
    }

    public Sum sumThemAll(Sum  sum) {

        return sum;
    }


}
