package ru.job4j.tracker.actions;

import ru.job4j.tracker.*;

import java.util.List;

public class ShowAllAction implements UserAction {
    private final Output out;

    public ShowAllAction(Output out) {
        this.out = out;
    }
    @Override
    public String name() {
        return "=== Show all item ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        List<Item> items = tracker.findAll();
        for(Item item : items) {
            out.println(item.getName());
        }
        return true;
    }
}
