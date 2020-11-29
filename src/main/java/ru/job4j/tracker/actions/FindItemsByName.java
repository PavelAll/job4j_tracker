package ru.job4j.tracker.actions;

import ru.job4j.tracker.*;

public class FindItemsByName implements UserAction {
    private final Output out;

    public FindItemsByName(Output out) {
        this.out = out;
    }
    @Override
    public String name() {
        return "=== Find items by name ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String name = input.askStr("Enter name: ");
        Item[] items = tracker.findByName(name);
        if (items.length > 0) {
            for(Item item : items) {
                out.println(item.getName());
            }
        } else {
            out.println("No tickets with this name were found");
        }
        return true;
    }
}
