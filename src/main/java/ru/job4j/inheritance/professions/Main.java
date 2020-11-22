package ru.job4j.inheritance.professions;

import ru.job4j.inheritance.professions.customer.Program;
import ru.job4j.inheritance.professions.doctor.Dentist;
import ru.job4j.inheritance.professions.doctor.Doctor;
import ru.job4j.inheritance.professions.doctor.Surgeon;
import ru.job4j.inheritance.professions.engineer.Builder;
import ru.job4j.inheritance.professions.engineer.Engineer;
import ru.job4j.inheritance.professions.engineer.Programmer;

public class Main {
    public static void main(String[] args) {
        Profession profession = new Profession("Иван");

        Doctor doctor = new Doctor();
        Dentist dentist = new Dentist();
        Surgeon surgeon = new Surgeon();

        Engineer engineer = new Engineer();
        Builder builder = new Builder();
        Programmer programmer = new Programmer();

        System.out.println(doctor.getName());
        System.out.println(surgeon.getName());
        System.out.println(engineer.getName());
        System.out.println(builder.getName());
        System.out.println(programmer.getName());

    }
}
