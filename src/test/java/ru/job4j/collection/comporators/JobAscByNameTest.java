package ru.job4j.collection.comporators;

import org.junit.Test;
import ru.job4j.collection.Job;
import java.util.Comparator;
import static org.hamcrest.Matchers.greaterThan;
import static org.junit.Assert.*;

public class JobAscByNameTest {
    @Test
    public void whenAscByNameCompare() {
        Comparator comp = new JobAscByName();
        int rsl = comp.compare(new Job("Pavel", 2), new Job("Aleks", 2));
        assertThat(rsl, greaterThan(0));
    }
}