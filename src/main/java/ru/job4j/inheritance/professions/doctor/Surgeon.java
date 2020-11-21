package ru.job4j.inheritance.professions.doctor;

import ru.job4j.inheritance.professions.pacient.Diagnosis;
import ru.job4j.inheritance.professions.pacient.HealthyPacient;
import ru.job4j.inheritance.professions.pacient.Pacient;

public class Surgeon extends Doctor{

    private String name = "Сергей";
    private String surname;
    private String education;
    private int birthday;

    Diagnosis diagnosis = new Diagnosis("какой то диагноз");


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

    public HealthyPacient operate(Pacient pacient) {
        pacient.setDiagnose(diagnosis);
        return pacient;
    }
}
