public class Bunnies {
    // We have a number of bunnies and each bunny has two big floppy ears.
    // We want to compute the total number of ears
    // across all the bunnies recursively (without loops or multiplication).

    public static void main(String[] args) {
        System.out.println(bunnyEars(20));
    }

    private static int bunnyEars(int i) {
        if (i==1)
            return 2;
        return 2 + bunnyEars(i-1);
    }
}
