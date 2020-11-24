package ru.job4j.tracker;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StartUI {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
        Tracker tracker = new Tracker();
        Item itemFirst = new Item();
        Item itemSecond = new Item();
        Item itemThird = new Item();

        itemFirst.setName("Заявление 1");
        itemSecond.setName("Заявление 2");
        itemThird.setName("Заявление 3");

        tracker.add(itemFirst);
        tracker.add(itemSecond);
        tracker.add(itemThird);

        Item rsl[] = tracker.findByName("Заявление 2");

        for (int i = 0; i < rsl.length; i++) {
            Item itm = rsl[i];
            System.out.println(itm.getName());
        }

        Item item = tracker.findById(3);
        System.out.println(item.getName());
    }
}
