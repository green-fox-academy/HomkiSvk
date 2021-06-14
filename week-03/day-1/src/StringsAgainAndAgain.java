public class StringsAgainAndAgain {
    // Given a string,
    // compute recursively a new string where
    // all the adjacent chars are now separated by a `*`

    public static void main(String[] args) {

        System.out.println(starAdder("saxanaxixi"));

    }

    private static String starAdder(String saxanaxixi) {
        if(saxanaxixi.length() == 0)
            return "";

        if (saxanaxixi.charAt(0) != '*')
            return "*" + saxanaxixi.charAt(0) + starAdder(saxanaxixi.substring(1));

        else
            return saxanaxixi.charAt(0) + starAdder(saxanaxixi.substring(1));
    }

}
