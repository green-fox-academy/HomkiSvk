package com.company;

public class TodoPrint {

    private static void indent(StringBuilder b, int i) {
        while (i-- > 0)
            b.append(" ");
    }

    public static void main(String... args){
        String todoText = " - Buy milk\n";
        // Add "My todo:" to the beginning of the todoText
        // Add " - Download games" to the end of the todoText
        // Add " - Diablo" to the end of the todoText applying indention

        // Expected output:

        // My todo:
        //  - Buy milk
        //  - Download games
        //      - Diablo

        StringBuilder list = new StringBuilder();
        list.append("My todo:\n");
        list.append(todoText);
        list.append(" - Download games\n");
        indent(list, 4);
        list.append(" - Diablo");

        todoText = list.toString();


        System.out.println(todoText);
    }
}