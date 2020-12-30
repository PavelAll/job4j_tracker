package ru.job4j.inheritance.professions.doctor;

import ru.job4j.inheritance.professions.pacient.Diagnosis;
import ru.job4j.inheritance.professions.pacient.Pacient;

public class Surgeon extends Doctor {
    private Diagnosis diagnosis;

    public Surgeon(String name, String surname) {
        super(name, surname);
    }

    public Diagnosis operate(Pacient pacient) {
        diagnosis = new Diagnosis("какой то диагноз");
        return diagnosis;
    }
}
