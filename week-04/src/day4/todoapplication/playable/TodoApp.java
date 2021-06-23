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
                        -r   Removes an task
                        -c   Completes an task
                    """);
        } else {
            switch (args[0]) {
                case "-l": {
                    if (args.length == 1) {
                        TaskList.listAllTasks();
                        break;
                    }
                }
                case "-a": {
                    if (args.length == 1) {
                        System.out.println("Unable do add: no task provided");
                        break;
                    } else {
                        TaskList.addNewTask(args[1]);
                    }
                    break;
                }
                case "-r": {
                    System.out.println("Removes a task");

                    //removeTask();
                    break;
                }
                case "-c": {
                    System.out.println("Completes a task");

                    //completeTask();
                    break;
                }
                default:
            }
        }

    }
}
