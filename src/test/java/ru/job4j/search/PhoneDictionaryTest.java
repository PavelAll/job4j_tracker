package ru.job4j.search;

import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class PhoneDictionaryTest {

    @Test
    public void whenFindByName() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(new Person("Petr", "Arsentev", "534872", "Bryansk"));
        ArrayList<Person> persons = phones.find("nsk");
        assertThat(persons.get(0).getSurname(), is("Arsentev"));
    }

    @Test
    public void whenFindByNameNewFunc() {
        PhoneDictionary phoneDictionary = new PhoneDictionary();
        phoneDictionary.add(
                new Person("Pavel", "Ivanov", "983469", "Moscow")
        );
        ArrayList<Person> persons = phoneDictionary.find("Pavel");
        assertThat(persons.get(0).getSurname(), is("Ivanov"));
    }
}