package ru.job4j.function.searchfolder;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SearchFolderTest {

    @Test
    public void whenFilterSize() {
        List<Folder> list = List.of(
                new Folder("fix", 110),
                new Folder("bug", 75),
                new Folder("bug", 90)
        );
        List<Folder> expected = List.of(new Folder("fix", 110));
        List<Folder> rsl = SearchFolder.filter(list, (f) -> f.getSize() > 100);
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenFilterName() {
        List<Folder> list = List.of(
                new Folder("fix", 110),
                new Folder("bug", 75),
                new Folder("bug", 90)
        );
        List<Folder> expected = List.of(
                new Folder("bug", 75),
                new Folder("bug", 90)
        );
        List<Folder> rsl = SearchFolder.filter(list, (f) -> f.getName().contains("bug"));
        assertThat(rsl, is(expected));
    }
}