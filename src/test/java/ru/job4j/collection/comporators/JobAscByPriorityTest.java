package ru.job4j.collection.comporators;

import org.junit.Test;
import ru.job4j.collection.Job;
import java.util.Comparator;
import static org.hamcrest.Matchers.greaterThan;
import static org.junit.Assert.*;

public class JobAscByPriorityTest {
    @Test
    public void whenAscByPriorityCompare() {
        Comparator comp = new JobAscByPriority();
        int rsl = comp.compare(new Job("Pavel", 4), new Job("Pavel", 2));
        assertThat(rsl, greaterThan(0));
    }
}