package singleton;

public class Singleton {

    public static void main(String[] args) {
        SingletonStaticFinalField ssff = SingletonStaticFinalField.getInstance();
        SingletonStatic singletonStaticField = SingletonStatic.getInstance();
        SingletonInnerClass sic = SingletonInnerClass.getInstance();
        SingletonEnum se = SingletonEnum.INSTANCE;
    }
}
