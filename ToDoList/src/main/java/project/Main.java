package project;

import java.util.Scanner;

public class Main {
    private static final int MAX_USERS = 100;
    private static User[] users = new User[MAX_USERS];
    private static int userCount = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println();
            System.out.println("1. Create User");
            System.out.println("2. Add Task");
            System.out.println("3. Mark Task as Completed");
            System.out.println("4. View Tasks");
            System.out.println("5. Exit");
            System.out.println();
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    if (userCount >= MAX_USERS) {
                        System.out.println("Maximum user limit reached.");
                        return;
                    }
                    System.out.print("Enter user name: ");
                    String name = scanner.nextLine();
                    users[userCount++] = new User(name);
                    System.out.println("User created.");
                    break;
                case 2:
                    User user = findUser(scanner);
                    if (user == null) break;

                    System.out.print("Enter task description: ");
                    String description = scanner.nextLine();
                    user.addTask(description);
                    System.out.println("Task added.");
                    break;
                case 3:
                    User foundUser = findUser(scanner);
                    if (foundUser != null) {
                        System.out.print("Enter task index to mark as completed: ");
                        int index = scanner.nextInt();
                        scanner.nextLine();
                        foundUser.markTaskAsComplete(index);
                        System.out.println("Task marked as completed.");
                    }
                    break;
                case 4:
                    User user1 = findUser(scanner);
                    if (user1 == null) return;

                    user1.printAllTasks();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private static User findUser(Scanner scanner) {
        System.out.print("Enter user name: ");
        String name = scanner.nextLine();

        for (int i = 0; i < userCount; i++) {
            if (users[i].getName().equalsIgnoreCase(name)) {
                return users[i];
            }
        }
        System.out.println("User not found.");
        return null;
    }
}

