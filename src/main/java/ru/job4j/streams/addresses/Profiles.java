package ru.job4j.streams.addresses;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Profiles {
    public List<Address> collect(List<Profile> profiles) {
        return profiles.stream()
                .map(Profile::getAddress)
                .collect(Collectors.toList());
    }

    public List<Address> sorted(Comparator<Address> comp, List<Profile> profiles) {
        List<Address> rsl = collect(profiles);
        Collections.sort(rsl, comp);
        return rsl.stream()
                .distinct()
                .collect(Collectors.toList());
    }
}
