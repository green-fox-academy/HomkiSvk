public class StringsAgain {
    // Given a string,
    // compute recursively a new string where
    // all the 'x' chars have been removed.

    public static void main(String[] args) {

        System.out.println(xRemoval("saxanaxixi"));

    }

    private static String xRemoval(String saxanaxixi) {
        if (saxanaxixi.length() == 0)
            return "";

        if (saxanaxixi.charAt(0) == 'x')
            return xRemoval(saxanaxixi.substring(1));

        return saxanaxixi.charAt(0) + xRemoval(saxanaxixi.substring(1));
    }
}
