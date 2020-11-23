package ru.job4j.inheritance.professions.doctor;

import ru.job4j.inheritance.professions.Profession;
import ru.job4j.inheritance.professions.pacient.Diagnosis;
import ru.job4j.inheritance.professions.pacient.Pacient;

public class Doctor extends Profession {
    public Doctor(String name, String surname) {
        super(name, surname);
    }
}
