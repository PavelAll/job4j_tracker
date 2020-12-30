package singleton;

public class LoadOrder {
    private static final String STATIC_FINAL_FIELD = echo("static final field");
    private static String staticField = echo("static field");
    private String surname = echo("field");
    private final String name = echo("final field");

    public LoadOrder(String msg) {
        echo("constructor " + msg);
    }

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

    public static String echo(String text) {
        System.out.println(text);
        return text;
    }

    public static void main(String[] args) {
        LoadOrder loadOrder = LoadOrder.getInstance();
    }
}
