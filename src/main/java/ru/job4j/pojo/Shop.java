package ru.job4j.pojo;

import ru.job4j.pojo.Product;

public class Shop {
    public static int indexOfNull(Product[] products) {
        for (int i = 0; i < products.length; i++) {
            if (products[i] == null) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Product[] products = new Product[5];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread", 4);
        products[2] = new Product("Egg", 19);

        for (int i = 0; i < products.length; i++) {
            Product pr = products[i];
            /* проверяем, что объект не равен null. Т.к. у нас массив не заполнен целиком. */
            if (pr != null) {
                System.out.println(pr.getName() + " " + pr.getCount());
            }
        }
    }
}
