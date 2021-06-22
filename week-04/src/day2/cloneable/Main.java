package day2.cloneable;


import java.util.ArrayList;

public class Main {

    public static void main(String[] args)  {

        ArrayList<Person> people = new ArrayList<>();

        Person mark = new Person("Mark", 46, "male");
        people.add(mark);
        Person jane = new Person();
        people.add(jane);
        Student john = new Student("John Doe", 20, "male", "BME");
        people.add(john);

        Student johnTheClone = john.clone();

        people.add(johnTheClone);

        System.out.println(people);


    }
}
