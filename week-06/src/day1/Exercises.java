package day1;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class Exercises {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);
        List<Integer> numbers2 = Arrays.asList(3, 9, 2, 8, 6, 5);
        List<Integer> numbers3 = Arrays.asList(5, 9, 1, 2, 3, 7, 5, 6, 7, 3, 7, 6, 8, 5, 4, 9, 6, 2);
        List<String> words = Arrays.asList("Peter", "Janko", "Ferko", "Franta");
        List<String> cities = Arrays.asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH", "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS");
        List<Character> sentence = Arrays.asList('J', 'a', 'n', 'k', 'o', ' ', 'a', ' ', 'M', 'a', 'r', 'i', 'e', 'n', 'k', 'a');
        String string = "Alphabetical numeric unordered";
        List<Fox> foxList = Arrays.asList(
                new Fox("Zelena", "Green", 6),
                new Fox("Biela", "White", 5),
                new Fox("Ruzova", "Pink", 4),
                new Fox("SvetloZelena", "Green", 5),
                new Fox("Modra", "Blue", 7),
                new Fox("TmavoZelena", "Green", 8),
                new Fox("Oranzova", "Orange", 3)
        );


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

        OptionalDouble average = numbers.stream()
                .filter(num -> Math.abs(num % 2) == 1)
                .mapToInt(Integer::intValue)
                .average();
        System.out.println(average);

        System.out.println("---------------");
        System.out.println("Exercise 5:");

        int sum = numbers3.stream()
                .filter(num -> num % 2 == 1)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(sum);

        System.out.println("---------------");
        System.out.println("Exercise 6:");

        words.toString()
                .chars()
                .filter(Character::isUpperCase)
                .forEach(upper -> System.out.println((char) upper));

        System.out.println("---------------");
        System.out.println("Exercise 7:");

        cities.stream()
                .filter(word -> word.startsWith("A"))
                .forEach(System.out::println);

        System.out.println("---------------");
        System.out.println("Exercise 8:");

        StringBuilder builder = new StringBuilder();
        sentence.forEach(builder::append);
        System.out.println(builder);

        System.out.println("---------------");
        System.out.println("Exercise 9:");

        string.chars()
                .mapToObj(c -> (char) c)
                .collect(groupingBy(c -> c, counting()))
                .entrySet().forEach(System.out::println);

        System.out.println("---------------");
        System.out.println("Exercise 10:");

        foxList.stream()
                .filter(fox -> fox.getColor().equals("Green"))
                .forEach(System.out::println);

        System.out.println("----");

        foxList.stream()
                .filter(fox -> fox.getColor().equals("Green"))
                .filter(fox -> fox.getAge() > 5)
                .forEach(System.out::println);

        System.out.println("----");

        foxList.stream()
                .collect(groupingBy(Fox::getColor, counting()))
                .entrySet()
                .forEach(System.out::println);

        System.out.println("--------------");
        System.out.println("Exercise 11:");

        try {
            Files.lines(Path.of("file.txt"), Charset.defaultCharset())
                    .flatMap(line -> Arrays.stream(line.trim().split(" ")))
                    .map(word -> word.replaceAll("[^a-zA-Z]", "").toLowerCase().trim())
                    .filter(word -> word.length() > 0)
                    .map(word -> new AbstractMap.SimpleEntry<>(word, 1))
                    .collect(groupingBy(AbstractMap.SimpleEntry::getKey, counting()))
                    .entrySet().stream()
                    .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                    .limit(100)
                    .forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("---------------");
        System.out.println("Exercise 12:");



    }
}
