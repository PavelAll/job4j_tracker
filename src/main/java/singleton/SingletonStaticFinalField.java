package singleton;

public class SingletonStaticFinalField {
    private static final SingletonStaticFinalField INSTANCE = new SingletonStaticFinalField();

    private SingletonStaticFinalField (){

    }

    public static SingletonStaticFinalField getInstance() {
        return INSTANCE;
    }
}
