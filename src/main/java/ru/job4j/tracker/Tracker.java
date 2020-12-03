package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    /*-----------------------------------*/
    // 1 метод Энергичная загрузка (Eager loading)
    private static final Tracker INSTANCE = new Tracker();
    public static Tracker getInstance1() {
        return INSTANCE;
    }
    /*-----------------------------------*/
    // 2 метод Ленивая загрузка (Lazy loading)
    private static Tracker INSTANCE2;
    public static Tracker getInstance2() {
        if (INSTANCE2 == null) {
            INSTANCE2 = new Tracker();
        }
        return INSTANCE2;
    }
    /*-----------------------------------*/
    // 3 метод через внутренний класс (Lazy loading)
    private static class Holder {
        private static final Tracker tracker = new Tracker();
    }

    public static Tracker getInstance3() {
        return Holder.tracker;
    }
    /*-----------------------------------*/
    // 4 метод через enum (Eager loading)
    public static Tracker tracker = new Tracker();

    public enum TrackerSingle {
        tracker;

        public static Tracker getInstance() {
            return Tracker.tracker;
        }
    }
    /*-----------------------------------*/
    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        boolean rsl = index != -1;
        if (rsl) {
            items[index] = item;
            items[index].setId(id);
            rsl = true;
        }
        return rsl;
    }

    public boolean delete(int id) {
        int index = indexOf(id);
        boolean rsl = index != -1;
        if (rsl) {
            int start = index + 1;
            int length = size - index;
            System.arraycopy(items, start, items, index, length);
            items[size - 1] = null;
            size--;
        }
        return rsl;
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public Item[] findAll() {
        return Arrays.copyOf(items, size);
    }

    public Item[] findByName(String key) {
        Item[] rsl = new Item[this.size];
        int size = 0;
        for (int i = 0; i < this.size; i++) {
            Item item = items[i];
            if (item.getName().equals(key)) {
                rsl[size] = item;
                size++;
            }
        }
        return Arrays.copyOf(rsl, size);
    }

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item findById(int id) {
        /* Находим индекс */
        int index = indexOf(id);
        /* Если индекс найден возвращаем item, иначе null */
        return index != -1 ? items[index] : null;
    }
}