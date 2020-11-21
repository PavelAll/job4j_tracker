package ru.job4j.inheritance.professions.engineer;

import ru.job4j.inheritance.professions.customer.Customer;
import ru.job4j.inheritance.professions.customer.Program;

public class Programmer extends Engineer{

    private String name = "Иван";
    private String surname;
    private String education;
    private int birthday;
    private Program program;

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


    public Program coding(Customer order) {
        return program;
    }
}
