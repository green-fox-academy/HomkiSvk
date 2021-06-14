public class Strings {
    // Given a string, compute recursively (no loops) a new string where
    // all the lowercase 'x' chars have been changed to 'y' chars.

    public static void main(String[] args) {

        System.out.println(xyChange("saxanaxixi"));

    }

    private static String xyChange(String saxanaxixi) {
        if (saxanaxixi.length() == 0)
            return "";

        if (saxanaxixi.charAt(0) == 'x')
            return "y" + xyChange(saxanaxixi.substring(1));

        else
            return saxanaxixi.charAt(0) + xyChange(saxanaxixi.substring(1));
    }

}
