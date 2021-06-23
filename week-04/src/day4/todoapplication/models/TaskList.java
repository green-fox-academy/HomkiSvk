package day4.todoapplication.models;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public abstract class TaskList {

    static List<Task> tasks = new ArrayList<>();
    static Path path = Path.of("src/day4/todoapplication/files/tasks.txt");

    // adds new task right into the txt file as a new entry with false status, using separator "   "
    public static void addNewTask(String task) {
        try {
            Files.writeString(path, task + "   false\n", StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //reads all the text into tasks List, so i can work with it in here
    private static void readFromFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader(path.toFile()))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] separation = line.split(" {3}");
                tasks.add(new Task(separation[0], separation[1]));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //rewrite the whole file with new data from tasks List, using separator "   "
    private static void writeToFile() {
        try {
            Files.writeString(path, "");
            for (Task task : tasks) {
                Files.writeString(path, task.getDescription() + "   " + task.isDone() + "\n", StandardOpenOption.APPEND);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //prints all tasks with increasing numbers at the start
    public static void listAllTasks() {
        TaskList.readFromFile();
        // if there is no task prints the message
        if (tasks.size() == 0) {
            System.out.println("No todos for today! :)");
        } else {
            int i = 1;
            for (Task task : tasks) {
                System.out.println(i + " - " + task);
                i++;
            }
        }
    }

    //read from file completes task and write to file again
    public static void completeTask(int index) {
        TaskList.readFromFile();
        if (index > tasks.size()) {
            System.out.println("Unable to check: index is out of bound");
        } else {
            tasks.get(index - 1).setDone(true);
        }
        TaskList.writeToFile();
    }

    //read from file, removing the entry and writes to file again
    public static void removeTask(int index) {
        TaskList.readFromFile();
        //if index is bigger than number of tasks prints the message
        if (index > tasks.size()) {
            System.out.println("Unable to remove: index is out of bound");
        } else {
            tasks.remove(index - 1);
            TaskList.writeToFile();
        }
    }

}
