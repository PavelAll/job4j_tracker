package ru.job4j.streams.addresses;

import org.junit.Test;

import java.util.Comparator;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ProfilesTest {

    @Test
    public void collect() {
        List<Profile> profiles = List.of(
                new Profile(new Address("Moscow", "Tverskaya", 23, 2)),
                new Profile(new Address("Irkutsk", "Radisheva", 2, 3)),
                new Profile(new Address("Yekaterinburg", "Sovetskaya", 34, 8)),
                new Profile(new Address("Vyborg", "Mira", 15, 5))
        );
        Profiles pr = new Profiles();
        List<Address> rsl = pr.collect(profiles);
        List<Address> expected = List.of(
                new Address("Moscow", "Tverskaya", 23, 2),
                new Address("Irkutsk", "Radisheva", 2, 3),
                new Address("Yekaterinburg", "Sovetskaya", 34, 8),
                new Address("Vyborg", "Mira", 15, 5)
        );
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenSortedAddresses() {
        List<Profile> profiles = List.of(
                new Profile(new Address("Moscow", "Tverskaya", 23, 2)),
                new Profile(new Address("Moscow", "Tverskaya", 23, 2)),
                new Profile(new Address("Yekaterinburg", "Sovetskaya", 34, 8)),
                new Profile(new Address("Yekaterinburg", "Sovetskaya", 34, 8))
        );

        Profiles pr = new Profiles();
        List<Address> rsl = pr.sorted(profiles);
        List<Address> expected = List.of(
                new Address("Moscow", "Tverskaya", 23, 2),
                new Address("Yekaterinburg", "Sovetskaya", 34, 8)
        );
        assertThat(rsl, is(expected));
    }
}