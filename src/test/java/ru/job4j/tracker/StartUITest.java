package ru.job4j.tracker;

import org.junit.Test;
import ru.job4j.tracker.actions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class StartUITest {

    @Test
    public void whenAddItem() {
        Output output = new StubOutput();
        String[] answers = {"Fix PC"};
        Input in = new ValidateInput(output, new StubInput(answers));
        Tracker tracker = new Tracker();
        new CreateAction(output).execute(in, tracker);
        Item created = tracker.findAll().get(0);
        Item expected = new Item("Fix PC");
        assertThat(created.getName(), is(expected.getName()));
    }

    @Test
    public void whenReplaceItem() {
        Output output = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = new Item("new item");
        tracker.add(item);
        String[] answers = {String.valueOf(item.getId()), "replaced item"};
        Input in = new ValidateInput(output, new StubInput(answers));
        new ReplaceAction(output).execute(in, tracker);
        Item replaced = tracker.findById(item.getId());
        assertThat(replaced.getName(), is("replaced item"));
    }

    @Test
    public void whenDeteleItem() {
        Output output = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = new Item("new item");
        tracker.add(item);
        String[] answers = {"1"};
        Input in = new ValidateInput(output, new StubInput(answers));
        new DeleteAction(output).execute(in, tracker);
        Item expected = tracker.findById(1);
        assertThat(expected, is(nullValue()));
    }

    @Test
    public void whenCreateItem() {
        Output output = new StubOutput();
        Input in = new ValidateInput(output, new StubInput(new String[] {"0", "Item name", "1"}));
        Tracker tracker = new Tracker();
        List<UserAction> actions = List.of(
                new CreateAction(output),
                new ExitAction()
        );
        new StartUI(output).init(in, tracker, actions);
        assertThat(tracker.findAll().get(0).getName(), is("Item name"));
    }

    @Test
    public void whenReplace() {
        Output output = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Replaced item"));
        Input in = new ValidateInput(output, new StubInput(new String[] {
                "0", "1", "Pavel All", "1"})
        );
        List<UserAction> actions = List.of(
                new ReplaceAction(output),
                new ExitAction()
        );
        new StartUI(output).init(in, tracker, actions);
        assertThat(tracker.findById(item.getId()).getName(), is("Pavel All"));
    }

    @Test
    public void whenDelete() {
        Output output = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Deleted item"));
        Input in = new ValidateInput(output, new StubInput(new String[]{"0", "1", "1"}));
        List<UserAction> actions = List.of(
                new DeleteAction(output),
                new ExitAction()
        );
        new StartUI(output).init(in, tracker, actions);
        assertThat(tracker.findById(item.getId()), is(nullValue()));
    }

    @Test
    public void whenExit() {
        Output output = new StubOutput();
        Input in = new ValidateInput(output,  new StubInput(new String[]{"0"}));
        Tracker tracker = new Tracker();
        List<UserAction> actions = List.of(
                new ExitAction()
        );
        new StartUI(output).init(in, tracker, actions);
        assertThat(output.toString(), is("Menu."
                + System.lineSeparator()
                + "0. === Exit ===" + System.lineSeparator()
        ));
    }

    @Test
    public void whenFindById() {
        Output output = new StubOutput();
        Input in = new ValidateInput(output, new StubInput(new String[]{"0", "1", "1"}));
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Find item by id"));
        List<UserAction> actions = List.of(
                new FindItemByIdAction(output),
                new ExitAction()
        );
        new StartUI(output).init(in, tracker, actions);
        assertThat(output.toString(), is("Menu."
                + System.lineSeparator()
                + "0. === Find item by Id ==="
                + System.lineSeparator()
                + "1. === Exit ===" + System.lineSeparator()
                + "Find item by id" + System.lineSeparator()
                + "Menu." + System.lineSeparator()
                + "0. === Find item by Id ===" + System.lineSeparator()
                + "1. === Exit ===" + System.lineSeparator()
        ));
    }

    @Test
    public void whenFindByName() {
        Output output = new StubOutput();
        Input in = new ValidateInput(output, new StubInput(
                new String[]{"0", "Find item by Name", "1"})
        );
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Find item by Name"));
        List<UserAction> actions = List.of(
                new FindItemsByName(output),
                new ExitAction()
        );
        new StartUI(output).init(in, tracker, actions);
        assertThat(output.toString(), is("Menu."
                + System.lineSeparator()
                + "0. === Find items by name ===" + System.lineSeparator()
                + "1. === Exit ===" + System.lineSeparator()
                + "Find item by Name" + System.lineSeparator()
                + "Menu." + System.lineSeparator()
                + "0. === Find items by name ===" + System.lineSeparator()
                + "1. === Exit ===" + System.lineSeparator()
        ));
    }

    @Test
    public void whenShowAll() {
        Output output = new StubOutput();
        Input in = new ValidateInput(output, new StubInput(new String[]{"0", "1"}));
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Show All"));
        List<UserAction> actions = List.of(
                new ShowAllAction(output),
                new ExitAction()
        );
        new StartUI(output).init(in, tracker, actions);
        assertThat(output.toString(), is("Menu."
                + System.lineSeparator()
                + "0. === Show all item ===" + System.lineSeparator()
                + "1. === Exit ===" + System.lineSeparator()
                + "Item{id=1, name='Show All'}" + System.lineSeparator()
                + "Menu." + System.lineSeparator()
                + "0. === Show all item ===" + System.lineSeparator()
                + "1. === Exit ===" + System.lineSeparator()
        ));
    }

    @Test
    public void whenInvalidExit() {
        Output out = new StubOutput();
        Input in = new ValidateInput(out, new StubInput(new String[] {"-1", "0"}));
        Tracker tracker = new Tracker();
        List<UserAction> actions = List.of(
                new ExitAction()
        );
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(String.format("Menu.%n"
                + "0. === Exit ===%n"
                + "Wrong input, you can select: 0 .. 0%n"
                + "Menu.%n"
                + "0. === Exit ===%n")
        ));
    }

    @Test
    public void whenSort() {
        Output output = new StubOutput();
        Input in = new ValidateInput(output, new StubInput(new String[] {"0", "1", "2"}));
        Tracker tracker = new Tracker();
        Item item1 = tracker.add(new Item("Ivan"));
        Item item2 = tracker.add(new Item("Pavel"));
        Item item3 = tracker.add(new Item("Aleks"));
        List<UserAction> actions = List.of(
                new Sort(),
                new ShowAllAction(output),
                new ExitAction()
        );
        new StartUI(output).init(in, tracker, actions);

        assertThat(output.toString(), is("Menu."
                + System.lineSeparator()
                + "0. === Sort In Ascending ===" + System.lineSeparator()
                + "1. === Show all item ===" + System.lineSeparator()
                + "2. === Exit ===" + System.lineSeparator()
                + "Menu." + System.lineSeparator()
                + "0. === Sort In Ascending ===" + System.lineSeparator()
                + "1. === Show all item ===" + System.lineSeparator()
                + "2. === Exit ===" + System.lineSeparator()
                + "Item{id=3, name='Aleks'}" + System.lineSeparator()
                + "Item{id=1, name='Ivan'}" + System.lineSeparator()
                + "Item{id=2, name='Pavel'}" + System.lineSeparator()
                + "Menu." + System.lineSeparator()
                + "0. === Sort In Ascending ===" + System.lineSeparator()
                + "1. === Show all item ===" + System.lineSeparator()
                + "2. === Exit ===" + System.lineSeparator()
        ));
    }

    @Test
    public void whenSortReverse() {
        Output output = new StubOutput();
        Input in = new ValidateInput(output, new StubInput(new String[] {"0", "1", "2"}));
        Tracker tracker = new Tracker();
        Item item1 = tracker.add(new Item("Ivan"));
        Item item2 = tracker.add(new Item("Pavel"));
        Item item3 = tracker.add(new Item("Aleks"));
        List<UserAction> actions = List.of(
                new SortReverse(),
                new ShowAllAction(output),
                new ExitAction()
        );
        new StartUI(output).init(in, tracker, actions);

        assertThat(output.toString(), is("Menu."
                + System.lineSeparator()
                + "0. === Sort In Descending ===" + System.lineSeparator()
                + "1. === Show all item ===" + System.lineSeparator()
                + "2. === Exit ===" + System.lineSeparator()
                + "Menu." + System.lineSeparator()
                + "0. === Sort In Descending ===" + System.lineSeparator()
                + "1. === Show all item ===" + System.lineSeparator()
                + "2. === Exit ===" + System.lineSeparator()
                + "Item{id=2, name='Pavel'}" + System.lineSeparator()
                + "Item{id=1, name='Ivan'}" + System.lineSeparator()
                + "Item{id=3, name='Aleks'}" + System.lineSeparator()
                + "Menu." + System.lineSeparator()
                + "0. === Sort In Descending ===" + System.lineSeparator()
                + "1. === Show all item ===" + System.lineSeparator()
                + "2. === Exit ===" + System.lineSeparator()
        ));
    }
}