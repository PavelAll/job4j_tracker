package ru.job4j.collection;

import org.junit.Test;
import ru.job4j.collection.comporators.JobAscByName;
import ru.job4j.collection.comporators.JobAscByPriority;
import ru.job4j.collection.comporators.JobDescByName;
import ru.job4j.collection.comporators.JobDescByPriority;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import java.util.Comparator;
import static org.junit.Assert.*;

public class JobTest {

    @Test
    public void whenCompatorByNameAndPriority() {
        Comparator<Job> cmpNamePriority = new JobDescByName().thenComparing(
                new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1));
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenCompatorDescByNameAndAscPriority() {
        Comparator<Job> cmpNamePriority = new JobDescByName().thenComparing(new JobAscByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 1),
                new Job("Impl task", 0)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenCompatorAscByNameAndAscPriority() {
        Comparator<Job> cmpNamePriority = new JobAscByName().thenComparing(new JobAscByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Pavel", 1),
                new Job("Aleks", 2)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenCompatorAscByNameAndDescPriority() {
        Comparator<Job> cmpNamePriority = new JobAscByName().thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Pavel", 1),
                new Job("Pavel", 3)
        );
        assertThat(rsl, greaterThan(0));
    }
}