package singleton;

import org.junit.Test;

import static org.junit.Assert.*;

public class SingletonStaticFieldTest {

    @Test
    public void whenStaticField() {
        SingletonStaticField rsl = SingletonStaticField.getInstance();
        assertSame(rsl, SingletonStaticField.getInstance());
    }
}