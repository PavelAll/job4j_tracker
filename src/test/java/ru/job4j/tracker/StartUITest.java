package ru.job4j.tracker;

import org.junit.Test;
import ru.job4j.tracker.actions.CreateAction;
import ru.job4j.tracker.actions.DeleteAction;
import ru.job4j.tracker.actions.ReplaceAction;

import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class StartUITest {

    @Test
    public void whenAddItem() {
        String[] answers = {"Fix PC"};
        Input input = new StubInput(answers);
        Tracker tracker = new Tracker();
        new CreateAction().execute(input, tracker);
        Item created = tracker.findAll()[0];
        Item expected = new Item("Fix PC");
        assertThat(created.getName(), is(expected.getName()));
    }


    @Test
    public void whenReplaceItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("new item");
        tracker.add(item);
        String[] answers = { String.valueOf(item.getId()), "replaced item"};
        Input input = new StubInput(answers);
        new ReplaceAction().execute(input, tracker);
        Item replaced = tracker.findById(item.getId());
        assertThat(replaced.getName(), is("replaced item"));
    }

    @Test
    public void whenDeteleItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("new item");
        tracker.add(item);
        String[] answers = {"1"};
        Input input = new StubInput(answers);
        new DeleteAction().execute(input, tracker);
        Item expected = tracker.findById(1);
        assertThat(expected, is(nullValue()));
    }
}