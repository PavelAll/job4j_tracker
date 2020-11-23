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
        Profession profession = new Profession("Иван", "Иванов");

        Doctor doctor = new Doctor("Дмитрий", "Дмитриев");
        Dentist dentist = new Dentist("Максим", "Максимов");
        Surgeon surgeon = new Surgeon("Николай", "Николаев");

        Engineer engineer = new Engineer("Михаил", "Михайлов");
        Builder builder = new Builder("Пётр", "Петров");
        Programmer programmer = new Programmer("Василий", "Васильев");

        System.out.println(doctor.getName() + " " + doctor.getSurname());
        System.out.println(surgeon.getName() + " " + surgeon.getSurname());
        System.out.println(dentist.getName() + " " + dentist.getSurname());
        System.out.println(engineer.getName() + " " + engineer.getSurname());
        System.out.println(builder.getName() + " " + builder.getSurname());
        System.out.println(programmer.getName() + " " + programmer.getSurname());


    }
}
