package singleton;

import ru.job4j.tracker.Tracker;

public class LoadOrder {
    private static final String STATIC_FINAL_FIELD = echo("static final field");
    private static String static_field = echo("static field");


    private static final class Holder {
        private static final LoadOrder INSTANCE = new LoadOrder("inner class Holder");
    }

    public static LoadOrder getInstance() {
        return Holder.INSTANCE;
    }

    {
       echo("not-static block");
    }

    static {
        echo("static block2");
    }
    static {
        echo("static block");
    }


    private String surname = echo("field");
    private final String name = echo("final field");

    public LoadOrder(String msg) {
        echo("constructor " + msg);
    }

    public static String echo(String text) {
        System.out.println(text);
        return text;
    }

    public static void main(String[] args) {
        //LoadOrder order = new LoadOrder("main");
        LoadOrder loadOrder = LoadOrder.getInstance();

    }

}
