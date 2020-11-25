package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Scanner;

public class StartUI {

    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            System.out.println("Select: ");
            int select = Integer.valueOf(scanner.nextLine());
            if (select == 0) {

                System.out.println("=== Create a new Item ===");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                tracker.add(item);

            } else if( select == 1) {

                System.out.println("=== Show all item ===");
                Item[] items = tracker.findAll();
                System.out.println(Arrays.toString(items));

            } else if( select == 2) {

                System.out.println("=== Edit itme ===");
                System.out.print("Enter Id: ");
                int id = Integer.valueOf(scanner.nextLine());
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                Item item = new Item(name);

                if (tracker.replace(id, item)) {
                    System.out.println("Item is replace");
                } else {
                    System.out.println("Item isn't replace");
                }

            } else if( select == 3) {

                System.out.println("=== Delete Item ===");
                System.out.print("Enter Id: ");
                int id = Integer.valueOf(scanner.nextLine());

                if (tracker.delete(id)) {
                    System.out.println("Item deleted");
                } else {
                    System.out.println("Item isn't deleted");
                }

            } else if( select == 4) {

                System.out.println("=== Find item by Id ===");
                System.out.print("Enter Id: ");
                int id = Integer.valueOf(scanner.nextLine());
                Item item = tracker.findById(id);

                if (item != null) {
                    System.out.println(item);
                } else {
                    System.out.println("Request with id not found");
                }

            } else if( select == 5) {

                System.out.println("=== Find items by name ===");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                Item[] items = tracker.findByName(name);
                if (items.length > 0) {
                    System.out.println(Arrays.toString(items));
                } else {
                    System.out.println("No tickets with this name were found");
                }

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
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }
}
