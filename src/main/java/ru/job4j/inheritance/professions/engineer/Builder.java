package ru.job4j.inheritance.professions.engineer;

import ru.job4j.inheritance.professions.customer.Customer;
import ru.job4j.inheritance.professions.customer.House;

import javax.xml.crypto.Data;

public class Builder extends Engineer {
    private House house;

    public Builder(String name, String surname) {
        super(name, surname);
    }

    public House build(Customer order) {
        house = new House("новый дом");
        return house;
    }
}
