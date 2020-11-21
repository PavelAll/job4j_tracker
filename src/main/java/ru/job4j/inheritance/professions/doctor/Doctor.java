package ru.job4j.inheritance.professions.doctor;

import ru.job4j.inheritance.professions.Profession;
import ru.job4j.inheritance.professions.pacient.Diagnosis;
import ru.job4j.inheritance.professions.pacient.Pacient;

public class Doctor extends Profession {
    private String name = "Григорий";
    Diagnosis diagnosis = new Diagnosis("какой то диагноз");

    public String getName() {
        return name;
    }

    public Pacient diagnose(Pacient pacient) {
        pacient.setDiagnose(diagnosis);
        return pacient;
    }
}
