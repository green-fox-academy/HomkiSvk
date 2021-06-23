package day4.todoapplication.playable;

import day4.todoapplication.models.TaskList;

public class TodoApp {

    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("""
                                        
                    Command Line Todo application
                    =============================
                                            
                    Command line arguments:
                        -l   Lists all the tasks
                        -a   Adds a new task
                        -r   Removes a task
                        -c   Completes a task
                    """);
        } else {
            switch (args[0]) {
                case "-l" -> {
                    if (args.length == 1) {
                        TaskList.listAllTasks();
                    }
                }
                case "-a" -> {
                    if (args.length == 1) {
                        System.out.println("Unable do add: no task provided");
                    } else {
                        TaskList.addNewTask(args[1]);
                    }
                }
                case "-r" -> {
                    if (args.length == 1) {
                        System.out.println("Unable to remove: no index provided");
                    } else {
                        try {
                            TaskList.removeTask(Integer.parseInt(args[1]));
                        } catch (NumberFormatException e) {
                            System.out.println("Unable to remove: index is not a number");
                        }
                    }
                }
                case "-c" -> {
                    if (args.length == 1) {
                        System.out.println("Unable to check: no index provided");
                    } else {
                        try {
                            TaskList.completeTask(Integer.parseInt(args[1]));
                        } catch (NumberFormatException e) {
                            System.out.println("Unable to check: index is not a number");
                        }
                    }
                }
                default -> System.out.println("""
                        Unsupported argument
                                                    
                        Command Line Todo application
                        =============================
                                                
                        Command line arguments:
                            -l   Lists all the tasks
                            -a   Adds a new task
                            -r   Removes a task
                            -c   Completes a task
                        """);
            }
        }
    }
}
