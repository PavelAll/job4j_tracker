package ru.job4j.collection;

import ru.job4j.collection.comporators.JobDescByName;
import ru.job4j.collection.comporators.JobDescByPriority;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class JobSorter {
    public static void main(String[] args) {
        List<Job> jobs = Arrays.asList(
                new Job("Fix bug", 1),
                new Job("Fix bug", 4),
                new Job("Fix bug", 2),
                new Job("X task", 0)
        );

        Collections.sort(jobs, new JobDescByName().thenComparing(new JobDescByPriority()));
        System.out.println(jobs);
        Comparator<Job> comb = new JobDescByName().thenComparing(new JobDescByPriority()).thenComparing(new JobDescByNameLn());
        Collections.sort(jobs, comb);
        System.out.println(jobs);
    }
}
