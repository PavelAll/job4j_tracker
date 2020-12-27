package ru.job4j.collection.treeset;

import org.junit.Test;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class UserTest {

    @Test
    public void whenAsc() {
        Set<User> users = new TreeSet<>();
        users.add(new User("Pavel", 32));
        users.add(new User("Ivan", 31));
        Iterator<User> it = users.iterator();
        assertThat(it.next(), is(new User("Ivan", 31)));
        assertThat(it.next(), is(new User("Pavel", 32)));
    }

    @Test
    public void whenComparePavelVSIvan() {
        int rsl = new User("Pavel", 32).compareTo(new User("Ivan", 31));
        assertThat(rsl, greaterThan(0));
    }
}