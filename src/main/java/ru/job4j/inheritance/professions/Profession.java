package ru.job4j.inheritance.professions;

public class Profession {
    private String name;
    private String surname;
    private String education;
    private int birthday;

    public Profession(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

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
