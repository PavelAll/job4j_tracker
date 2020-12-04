package ru.job4j.ooa;

public class Main {
    public static void main(String[] args) {
        final User FIRST_USER = new User("Pavel", 31);
        System.out.println("Вывод в консоль до изменения.");
        System.out.println(FIRST_USER);

        FIRST_USER.setName("Pavel Alekseev");
        FIRST_USER.setAge(33);
        System.out.println("Вывод в консоль после изменения.");
        System.out.println(FIRST_USER);

    }
}
