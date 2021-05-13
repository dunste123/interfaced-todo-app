package me.duncte123.killme.app;

import java.io.IOException;

public interface ToDoApp {
    default void start() throws IOException {
        final ConsoleHandler handler = new ConsoleHandler() {};

        System.out.println("Welcome!");
        handler.sendHelpMessage();

        boolean mayContinue = true;

        while (mayContinue) {
            mayContinue = handler.handleConsole();
        }
    }
}
