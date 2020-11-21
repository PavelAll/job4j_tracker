package ru.job4j.inheritance.professions.engineer;

import ru.job4j.inheritance.professions.Profession;

public class Engineer extends Profession {

    private String name;
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
}
