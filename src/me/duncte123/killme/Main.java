package me.duncte123.killme;

import me.duncte123.killme.app.ToDoApp;

import java.io.IOException;

// This is the only class that will ever be used in the project
// Java requires the main class to be a class :(
public class Main {

    public static void main(String[] args) throws IOException {
        // yes this is how we are playing
        new ToDoApp() {}.start();
    }
}
