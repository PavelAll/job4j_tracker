package ru.job4j.pojo;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class LicenseTest {

    @Test
    public void eqOwner() {
        License first = new License();
        first.setOwner("Ivanov");
        License second = new License();
        second.setOwner("Ivanov");
        assertThat(first, is(second));
    }


    @Test
    public void eqCode() {
        License first = new License();
        first.setCode("audio");
        License second = new License();
        second.setCode("audio");
        assertThat(first, is(second));
    }
}