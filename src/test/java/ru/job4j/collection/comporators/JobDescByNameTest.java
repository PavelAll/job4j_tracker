package ru.job4j.collection.comporators;

import org.junit.Test;
import ru.job4j.collection.Job;
import java.util.Comparator;
import static org.hamcrest.Matchers.greaterThan;
import static org.junit.Assert.assertThat;

public class JobDescByNameTest {
    @Test
    public void whenDescByNameCompare() {
        Comparator<Job> comp = new JobDescByName();
        int rsl = comp.compare(
                new Job("Aleks", 1),
                new Job("Bavel", 4)
        );
        assertThat(rsl, greaterThan(0));
    }
}