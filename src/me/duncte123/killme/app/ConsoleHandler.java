package me.duncte123.killme.app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public interface ConsoleHandler {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    ToDoController controller = new ToDoController() {};

    default boolean handleConsole() throws IOException {
        System.out.print("> ");
        final String line = reader.readLine();

        if (line.isBlank()) {
            sendHelpMessage();
            return true;
        }

        final String[] split = line.split("\\s+", 2);

        switch (split[0].toLowerCase()) {
            case "add" -> {
                if (split.length < 2) {
                    System.out.println("You did not supply what you want to add, try again");
                    break;
                }

                controller.addToDo(split[1]);
            }
            case "remove" -> {
                if (split.length < 2) {
                    System.out.println("You did not supply what you want to remove, try again");
                    break;
                }

                controller.removeToDo(split[1]);
            }
            case "list" -> controller.listTodos();
            case "exit" -> {
                System.out.println("Good bye");
                return false;
            }
            case "help" -> sendHelpMessage();
            default -> {
                System.out.println("Unknown command " + split[0]);
                sendHelpMessage();
            }
        }

        return true;
    }

    default void sendHelpMessage() {
        System.out.println("Commands are:");
        System.out.println("    add [item]");
        System.out.println("    remove [item]");
        System.out.println("    list");
        System.out.println("    exit");
    }
}
