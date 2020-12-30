package singleton;

public class SingletonStatic {
    private static SingletonStatic instance;

    private SingletonStatic() {

    }

    public static SingletonStatic getInstance() {
        if (instance == null) {
            instance = new SingletonStatic();
        }
        return instance;
    }
}
