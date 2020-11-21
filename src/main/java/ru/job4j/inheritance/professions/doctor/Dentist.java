package ru.job4j.inheritance.professions.doctor;

import ru.job4j.inheritance.professions.pacient.HealthyPacient;
import ru.job4j.inheritance.professions.pacient.Pacient;

public class Dentist extends Doctor{

    private String name = "Владимир";
    private String surname;
    private String education;
    private int birthday;

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

    public HealthyPacient heal(Pacient pacient) {
        return pacient;
    }
}
