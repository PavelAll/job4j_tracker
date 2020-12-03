package singleton;

import org.junit.Test;

import static org.junit.Assert.*;

public class SingletonStaticFinalFieldTest {

    @Test
    public void whenStaticFinalField() {
        SingletonStaticFinalField rsl = SingletonStaticFinalField.getInstance();
        assertSame(rsl, SingletonStaticFinalField.getInstance());
    }
}