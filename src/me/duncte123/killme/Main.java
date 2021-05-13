package me.duncte123.killme;

import me.duncte123.killme.app.ToDoApp;

import java.io.IOException;

// Yes even this is an interface
public interface Main {
    static void main(String[] args) throws IOException {
        // yes this is how we are playing
        new ToDoApp() {}.start();
    }
}
