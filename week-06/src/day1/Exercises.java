package day1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercises {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);
        List<Integer> numbers2 = Arrays.asList(3, 9, 2, 8, 6, 5);
        List<Integer> numbers3 = Arrays.asList(5, 9, 1, 2, 3, 7, 5, 6, 7, 3, 7, 6, 8, 5, 4, 9, 6, 2);


        System.out.println("Exercise 1:");
        numbers.stream()
                .distinct()
                .filter(num -> num % 2 == 0)
                .forEach(System.out::println);

        System.out.println("---------------");
        System.out.println("Exercise 2:");

        numbers.stream()
                .distinct()
                .filter(num -> num > 0)
                .forEach(num -> System.out.println(Math.pow(num, 2)));

        System.out.println("---------------");
        System.out.println("Exercise 3:");

        numbers2.stream()
                .map(num -> Math.pow(num, 2))
                .filter(num -> num > 20)
                .forEach(System.out::println);

        System.out.println("---------------");
        System.out.println("Exercise 4:");

        int sum = numbers.stream()
                .filter(num -> num % 2 == 1)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(sum);

        System.out.println("---------------");
        System.out.println("Exercise 5:");



        System.out.println("---------------");
        System.out.println("Exercise 6:");
        System.out.println("---------------");
        System.out.println("Exercise 7:");
        System.out.println("---------------");
        System.out.println("Exercise 8:");
        System.out.println("---------------");
        System.out.println("Exercise 9:");
        System.out.println("---------------");
        System.out.println("Exercise 10:");
        System.out.println("---------------");
        System.out.println("Exercise 11:");
        System.out.println("---------------");
        System.out.println("Exercise 12:");

    }
}
