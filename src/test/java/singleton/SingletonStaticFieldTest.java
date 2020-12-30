package singleton;

import org.junit.Test;

import static org.junit.Assert.*;

public class SingletonStaticFieldTest {

    @Test
    public void whenStaticField() {
        SingletonStatic rsl = SingletonStatic.getInstance();
        assertSame(rsl, SingletonStatic.getInstance());
    }
}