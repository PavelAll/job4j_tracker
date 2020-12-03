package singleton;

import org.junit.Test;

import static org.junit.Assert.*;

public class SingletonInnerClassTest {

    @Test
    public void whenInnerClass() {
        SingletonInnerClass rsl = SingletonInnerClass.getInstance();
        assertSame(rsl, SingletonInnerClass.getInstance());
    }
}