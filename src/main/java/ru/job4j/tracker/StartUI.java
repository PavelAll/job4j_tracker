package ru.job4j.tracker;

import java.util.Scanner;

public class StartUI {

    public static void createItem(Input input, Tracker tracker) {
        System.out.println("=== Create a new Item ===");
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        tracker.add(item);
    }

    public static void showAllItem(Tracker tracker) {
        System.out.println("=== Show all item ===");
        Item[] items = tracker.findAll();
        for(Item item : items) {
            System.out.println(item);
        }
    }

    public static void replaceItem(Input input, Tracker tracker ) {
        System.out.println("=== Update item ===");
        int id = input.askInt("Enter Id: ");
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        if (tracker.replace(id, item)) {
            System.out.println("Item is replace");
        } else {
            System.out.println("Item isn't replace");
        }
    }

    public static void deteleItem(Input input, Tracker tracker) {
        System.out.println("=== Delete Item ===");
        int id = input.askInt("Enter Id: ");
        if (tracker.delete(id)) {
            System.out.println("Item deleted");
        } else {
            System.out.println("Item isn't deleted");
        }
    }

    public static void findItemById(Input input, Tracker tracker) {
        System.out.println("=== Find item by Id ===");
        int id = input.askInt("Enter Id: ");
        Item item = tracker.findById(id);
        if (item != null) {
            System.out.println(item);
        } else {
            System.out.println("Request with id not found");
        }
    }

    public static void findItemsByName(Input input, Tracker tracker) {
        System.out.println("=== Find items by name ===");
        String name = input.askStr("Enter name: ");
        Item[] items = tracker.findByName(name);
        if (items.length > 0) {
            for(Item item : items) {
                System.out.println(item);
            }
        } else {
            System.out.println("No tickets with this name were found");
        }
    }


    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = input.askInt("Select: ");
            if (select == 0) {
                StartUI.createItem(input, tracker);
            } else if( select == 1) {
                StartUI.showAllItem(tracker);
            } else if( select == 2) {
                StartUI.replaceItem(input, tracker);
            } else if( select == 3) {
                StartUI.deteleItem(input, tracker);
            } else if( select == 4) {
                StartUI.findItemById(input, tracker);
            } else if( select == 5) {
                StartUI.findItemsByName(input, tracker);
            } else if( select == 6) {
                run = false;
            }
        }
    }

    private void showMenu() {
        System.out.println("Menu.");
        System.out.println("0. Add new item");
        System.out.println("1. Show all item");
        System.out.println("2. Edit itme");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }
}
