package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.Matchers.closeTo;
import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when00To02Then2() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double rsl = a.distance(b);
        assertThat(rsl, closeTo(2, 0.001));
    }

    @Test
    public void when13to03Then1() {
        Point a = new Point(1, 3);
        Point b = new Point(0, 3);
        double rsl = b.distance(a);
        assertThat(rsl, closeTo(1, 0.001));
    }

    @Test
    public void when003to223Then2() {
        Point a = new Point(0, 0, 3);
        Point b = new Point(2, 2, 3);
        double rsl = a.distance3d(b);
        assertThat(rsl, closeTo(2.828, 0.001));
    }

    @Test
    public void when110to223Then3() {
        Point a = new Point(1, 1, 0);
        Point b = new Point(2, 2, 3);
        double rsl = a.distance3d(b);
        assertThat(rsl, closeTo(3.3166, 0.001));
    }
}