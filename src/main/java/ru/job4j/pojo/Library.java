package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book[] books = new Book[4];
        books[0] = new Book("Война и мир", 1274);
        books[1] = new Book("Мастер и Маргарита", 470);
        books[2] = new Book("Clean code", 100);
        books[3] = new Book("Мертвые души", 300);

        for (int index = 0; index < books.length; index++) {
            Book bk = books[index];
            System.out.println(bk.getName() + " - " + bk.getPage());
        }

        System.out.println("Swap book " + "\"" + books[0].getName() + "\"" + " with book " + "\"" + books[3].getName() + "\"");

        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;


        for (int index = 0; index < books.length; index++) {
            Book bk = books[index];
            System.out.println(bk.getName() + " - " + bk.getPage());
        }

        System.out.println("Output of books named \"Clean code\"");

        for (int index = 0; index < books.length; index++) {
            Book bk = books[index];
            if (bk.getName().equals("Clean code")) {
                System.out.println(bk.getName() + " - " + bk.getPage());
            }
        }
    }
}
