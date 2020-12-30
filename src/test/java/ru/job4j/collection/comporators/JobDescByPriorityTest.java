package ru.job4j.collection.comporators;

import org.junit.Test;
import ru.job4j.collection.Job;
import java.util.Comparator;
import static org.hamcrest.Matchers.greaterThan;
import static org.junit.Assert.assertThat;

public class JobDescByPriorityTest {

    @Test
    public void whenDescByPriorityCompare() {
        Comparator comp = new JobDescByPriority();
        int rsl = comp.compare(new Job("Pavel", 1), new Job("Pavel", 4));
        assertThat(rsl, greaterThan(0));
    }
}