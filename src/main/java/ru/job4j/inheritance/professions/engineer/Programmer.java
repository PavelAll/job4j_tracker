package ru.job4j.inheritance.professions.engineer;

import ru.job4j.inheritance.professions.customer.Customer;
import ru.job4j.inheritance.professions.customer.Program;

public class Programmer extends Engineer{
    private Program program;

    public Programmer() {
        super();
    }

    public Program coding(Customer order) {
        program = new Program("какая то программа");
        return program;
    }
}
