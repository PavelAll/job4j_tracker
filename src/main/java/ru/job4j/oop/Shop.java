package ru.job4j.oop;

public class Shop {

    public static void main(String[] args) {
        Product product = of("Oil", 100);
        Product product2 = of("Bread", 58);
        Product product3 = of("Meat", 200);

        System.out.println(product.label());
        System.out.println(product2.label());
        System.out.println(product3.label());
    }

    public static Product of(String name, int price) {
        if ("Meat".equals(name)) {
            return new LiquidationProduct(name, price).getProduct();
        }
        return new Product(name, price);
    }
}
