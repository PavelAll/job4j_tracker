package ru.job4j.inheritance.professions.doctor;

import ru.job4j.inheritance.professions.pacient.Diagnosis;
import ru.job4j.inheritance.professions.pacient.Pacient;

public class Dentist extends Doctor {
    private Diagnosis diagnosis;

    public Dentist(String name, String surname) {
        super(name, surname);
    }

    public Diagnosis heal(Pacient pacient) {
        diagnosis = new Diagnosis("какой то диагноз");
        return diagnosis;
    }
}
