package ru.job4j.collection.hashset;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class NotifyAccountTest {

    @Test
    public void whenNotDuplicate() {
        List<Account> accounts = Arrays.asList(
                new Account("123", "Pavel Alexeev", "eDer3432f"),
                new Account("142", "Pavel Alexeev", "00001")
        );

        HashSet<Account> expect = new HashSet<>(
                Arrays.asList(
                        new Account("123", "Pavel Alexeev", "eDer3432f"),
                        new Account("142", "Pavel Alexeev", "000001")
                )
        );
        assertThat(NotifyAccount.sent(accounts), is(expect));
    }

    @Test
    public void whenDuplicate() {
        List<Account> accounts = Arrays.asList(
                new Account("123", "Pavel Alexeev", "eDer3432f"),
                new Account("123", "Pavel Alexeev", "00001")
        );

        HashSet<Account> expect = new HashSet<>(
                Arrays.asList(
                        new Account("123", "Pavel Alexeev", "eDer3432f")
                )
        );
        assertThat(NotifyAccount.sent(accounts), is(expect));
    }
}