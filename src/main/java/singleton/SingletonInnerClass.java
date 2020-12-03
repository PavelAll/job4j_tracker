package singleton;

public class SingletonInnerClass {

    private static class Holder {
        private static final SingletonInnerClass INSTANCE = new SingletonInnerClass();

        private Holder() {

        }
    }

    private SingletonInnerClass() {

    }

    public static SingletonInnerClass getInstance() {
        return Holder.INSTANCE;
    }
}
