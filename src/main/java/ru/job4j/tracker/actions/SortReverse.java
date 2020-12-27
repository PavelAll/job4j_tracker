package ru.job4j.tracker.actions;

import ru.job4j.tracker.Input;
import ru.job4j.tracker.Item;
import ru.job4j.tracker.Tracker;
import ru.job4j.tracker.UserAction;
import java.util.Collections;
import java.util.Comparator;

public class SortReverse implements UserAction, Comparator<Item> {
    @Override
    public String name() {
        return "=== Sort In Descending ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        Collections.sort(tracker.getItems(), new SortReverse());
        Collections.reverse(tracker.getItems());
        return true;
    }

    @Override
    public int compare(Item o1, Item o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
