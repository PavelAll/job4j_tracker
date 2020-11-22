package ru.job4j.oop;

public final class LiquidationProduct {
    private Product product;

    public LiquidationProduct(String name, int price) {
        product = new Product(name, price);
        product.setPrice(this.price());
    }

    public Product getProduct() {
        return product;
    }

    public int price() {
        return product.getPrice() - discount();
    }

    public int discount() {
        return 90;
    }

    public String label() {
        return product.label();
    }
}
