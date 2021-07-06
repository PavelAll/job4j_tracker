package ru.job4j.streams.students;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class School {
    public List<Student> collect(List<Student> students, Predicate<Student> predicate) {
        List<Student> rsl = students.stream().filter(predicate).collect(Collectors.toList());
        return rsl;
    }
}
