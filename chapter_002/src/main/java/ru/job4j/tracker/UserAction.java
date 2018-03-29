package ru.job4j.tracker;

public interface UserAction {
    String info();
    int key();
    void execute(Input input, Tracker tracker);
}
