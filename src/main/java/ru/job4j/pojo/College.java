package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Pavel");
        student.setSurname("Alekseev");
        student.setPatronymic("Mikhailovich");
        student.setGroup(122);
        student.setAdmission(new Date());

        System.out.println(student.getSurname() + " " + student.getName() + " " + student.getPatronymic() +
                "\nГруппа - " + student.getGroup() + "\nДата поступления - " + student.getAdmission());
    }
}
