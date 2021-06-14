import java.util.Arrays;

public class MaximumFinder {
    // Write a function that finds the largest element of an array using recursion.

    public static void main(String[] args) {

        int [] testArr = new int[] {-5,-9, -8, -42, -6, -2, -12, -37, -1};
        
        System.out.println(findMax(testArr));
        
    }

    private static int findMax(int[] testArr) {
        if (testArr.length == 1)
            return testArr[0];

        if (testArr.length == 2)
            return testArr[1] = Math.max(testArr[0], testArr[1]);

        return Math.max(testArr[1], findMax(Arrays.copyOfRange(testArr, 1, testArr.length)));
        
        
    }
}
