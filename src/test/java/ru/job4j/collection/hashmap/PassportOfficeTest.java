package ru.job4j.collection.hashmap;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class PassportOfficeTest {

    @Test
    public void whenTrue() {
        Citizen citizen = new Citizen("2f44a", "Pavel Alekseev");
        PassportOffice office = new PassportOffice();
        office.add(citizen);
        assertThat(office.get(citizen.getPassport()), is(citizen));
    }

    @Test
    public void whenFalse() {
        PassportOffice office = new PassportOffice();
        office.add(new Citizen("2f44a", "Pavel Alekseev"));
        Citizen citizen = new Citizen("2f44a", "Pavel Alekseev");
        assertThat(office.add(citizen), is(false));
    }
}