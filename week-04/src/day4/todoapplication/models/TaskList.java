package day4.todoapplication.models;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public abstract class TaskList{

    static List<Task> tasks = new ArrayList<>();
    static  Path path = Path.of("/files/tasks.txt");

    public static void addNewTask(String task) {
        tasks.add(new Task(task));
    }

    public static void listAllTasks() {
        try {
            List<String> stringList = Files.readAllLines(path);
        } catch (IOException e) {
            System.out.println("No todos for today! :)");;
        }
    }

}
