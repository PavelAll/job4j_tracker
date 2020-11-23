package ru.job4j.pojo;

public class ShopDrop {

    public static Product[] leftShift(Product[] products, int index) {

        for (int i = index; i < products.length; i++) {
            if (i != products.length - 1 && products[i + 1] != null ) {
                products[i] = products[i + 1];
            } else {
                products[i] = null;
            }
        }
        return products;
    }
    
    public static void main(String[] args) {
        Product[] products = new Product[3];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread", 4);
        products[2] = new Product("Egg", 19);
        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            if (product != null) {
                System.out.println(product.getName());
            } else {
                System.out.println("null");
            }
        }
        products[1] = products[2];
        products[2] = null;
        System.out.println();

        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            if (product != null) {
                System.out.println(product.getName());
            } else {
                System.out.println("null");
            }
        }
    }
}
