/* ToDoList with Random Module 
 * @author : Pradumn Patel (JV Grace)
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TodoList {
    
    private final List<Task1> tasks = new ArrayList<>();
    private final static Scanner scanner = new Scanner(System.in);

    public void run() {
        while (true) {
            System.out.println("Todo List Menu:");
            System.out.println("1. List all tasks");
            System.out.println("2. Add new task");
            System.out.println("3. Update task");
            System.out.println("4. Delete task");
            System.out.println("5. Quit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> listTasks();
                case 2 -> addTask();
                case 3 -> updateTask();
                case 4 -> deleteTask();
                case 5 -> {
                    System.out.println("Goodbye!");
                    return;
                }
                default -> System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private void listTasks() {
        System.out.println("Tasks:");
        for (Task1 task : tasks) {
            System.out.println(task.getName() + " (Due: " + task.getDueDate() + ")");
        }
    }

    private void addTask() {
        System.out.print("Enter task name: ");
        String name = scanner.next();
        System.out.print("Enter due date (optional): ");
        String dueDate = scanner.next();

        Task1 task = new Task1(name, dueDate);
        tasks.add(task);
        System.out.println("Task added successfully!");
    }

    private void updateTask() {
        System.out.print("Enter task name to update: ");
        String name = scanner.next();
        Task1 task = findTask(name);
        if (task == null) {
            System.out.println("Task not found.");
            return;
        }

        System.out.print("Enter new due date (optional): ");
        String newDueDate = scanner.next();
        task.setDueDate(newDueDate);
        System.out.println("Task updated successfully!");
    }

    private void deleteTask() {
        System.out.print("Enter task name to delete: ");
        String name = scanner.next();
        Task1 task = findTask(name);
        if (task == null) {
            System.out.println("Task not found.");
            return;
        }

        tasks.remove(task);
        System.out.println("Task deleted successfully!");
    }

    private Task1 findTask(String name) {
        for (Task1 task : tasks) {
            if (task.getName().equals(name)) {
                return task;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        TodoList t1 =new TodoList();
        t1.run();
    }
}

class Task1 {
    private final String name;
    private String dueDate;

    public Task1(String name, String dueDate) {
        this.name = name;
        this.dueDate = dueDate;
    }

    public String getName() {
        return name;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }
}