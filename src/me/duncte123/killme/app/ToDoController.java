package me.duncte123.killme.app;

import java.util.ArrayList;
import java.util.List;

public interface ToDoController {
    List<String> todos = new ArrayList<>();

    default void addToDo(String todo) {
        if (todos.contains(todo)) {
            System.out.println("This todo already exists");
            return;
        }

        todos.add(todo);
        System.out.println("Todo added");
    }

    default void removeToDo(String todo) {
        if (!todos.contains(todo)) {
            System.out.println("That todo does not exist");
            return;
        }

        todos.remove(todo);
        System.out.println("Todo removed");
    }

    default void listTodos() {
        if (todos.isEmpty()) {
            System.out.println("There are currently no todos");
            return;
        }

        System.out.println("Current todos are: ");
        System.out.println("- " + String.join("\n- ", todos));
    }
}
