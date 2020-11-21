package ru.job4j.inheritance.professions.engineer;

import ru.job4j.inheritance.professions.customer.Customer;
import ru.job4j.inheritance.professions.customer.House;

import javax.xml.crypto.Data;

public class Builder extends Engineer {
    private String name = "Петя";
    private String surname;
    private String education;
    private int birthday;

    private House house;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEducation() {
        return education;
    }

    public int getBirthday() {
        return birthday;
    }

    public House build(Customer order) {
        return house;
    }
}
