package me.duncte123.killme.app;

import java.io.IOException;

public interface ToDoApp {
    default void start() throws IOException {
        final ConsoleHandler handler = new ConsoleHandler() {};

        System.out.println("Welcome!");
        handler.sendHelpMessage();

        boolean mayContinue;

        do {
            mayContinue = handler.handleConsole();
        } while (mayContinue);
    }
}
