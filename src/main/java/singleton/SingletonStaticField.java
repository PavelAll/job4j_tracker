package singleton;

public class SingletonStaticField {
    private static SingletonStaticField INSTANCE;

    private SingletonStaticField() {

    }

    public static SingletonStaticField getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new SingletonStaticField();
        }
        return INSTANCE;
    }
}
