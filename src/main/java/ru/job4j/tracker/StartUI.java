package ru.job4j.tracker;

import ru.job4j.tracker.actions.*;

public class StartUI {
    private final Output out;

    public StartUI(Output out) {
        this.out = out;
    }


    public void init(Input input, Tracker tracker, UserAction[] actions) {
        boolean run = true;
        while (run) {
            this.showMenu(actions);
            int select = input.askInt("Select: ");
            if (select < 0 || select >= actions.length) {
                out.println("Wrong input, you can select: 0 .. " + (actions.length - 1));
                continue;
            }
            UserAction action = actions[select];
            run = action.execute(input, tracker);
        }
    }

    private void showMenu(UserAction[] actions) {
        out.println("Menu.");
        for (int index = 0; index < actions.length; index++) {
            out.println(index + ". " + actions[index].name());
        }
    }

    public static void main(String[] args) {
        Output output = new ConsoleOutput();
        Input input = new ValidateInput(output, new ConsoleInput());

        Tracker tracker2 = Tracker.getInstance1();

        Tracker tracker_1 = Tracker.getInstance1();
        Tracker tracker_2 = Tracker.getInstance2();
        Tracker tracker_3 = Tracker.getInstance3();
        Tracker tracker_4 = Tracker.TrackerSingle.getInstance();

        UserAction[] actions = {
                new CreateAction(output),
                new ShowAllAction(output),
                new ReplaceAction(output),
                new DeleteAction(output),
                new FindItemByIdAction(output),
                new FindItemsByName(output),
                new ExitAction()
        };
        new StartUI(output).init(input, tracker_1, actions);
    }
}
