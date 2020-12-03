package singleton;

import org.junit.Test;

import static org.junit.Assert.*;

public class SingletonEnumTest {

    @Test
    public void whenEnum() {
        SingletonEnum rsl = SingletonEnum.INSTANCE;
        assertSame(rsl, SingletonEnum.INSTANCE);
    }
}