package day3.printalbeInterface;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Domino> dominoes = initializeDominoes();
        List<Todo> todos = initializeTodos();

        for (Domino domino : dominoes) {
            domino.printAllFields();
        }

        System.out.println();
        todos.get(2).doTheTask();
        todos.get(3).doTheTask();

        for (Todo todo : todos) {
            todo.printAllFields();
        }
    }

    static List<Domino> initializeDominoes() {
        List<Domino> dominoes = new ArrayList<>();
        dominoes.add(new Domino(5, 2));
        dominoes.add(new Domino(4, 6));
        dominoes.add(new Domino(1, 5));
        dominoes.add(new Domino(6, 7));
        dominoes.add(new Domino(2, 4));
        dominoes.add(new Domino(7, 1));
        return dominoes;
    }

    static List<Todo> initializeTodos() {
        List<Todo> todos = new ArrayList<>();
        todos.add(new Todo("clean", "medium"));
        todos.add(new Todo("wash the dishes", "immediate"));
        todos.add(new Todo("prepare for interview", "high"));
        todos.add(new Todo("walk the dog", "low"));
        return todos;
    }
}
