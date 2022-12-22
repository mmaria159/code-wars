package kata6kyu;

import com.mariamacovei.kata6kyu.OverflowingWithLong;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OverflowingWithLongTest {

    @Test
    public void test00() {
        assertEquals(0, OverflowingWithLong.multiply(0, 0));
    }

    @Test
    public void test2345() {
        assertEquals(1035, OverflowingWithLong.multiply(23, 45));
    }

    @Test
    public void test3456() {
        assertEquals(-1904, OverflowingWithLong.multiply(-34, 56));
    }

    @Test
    public void testMin() {
        assertEquals(Long.MIN_VALUE, OverflowingWithLong.multiply(-2147483648L, 4294967296L));
    }

    @Test
    public void testMax() {
        assertEquals(Long.MAX_VALUE, OverflowingWithLong.multiply(2323823089L, 3969050863L));
    }

    @Test(expected = ArithmeticException.class)
    public void testOverflowMax() {
        OverflowingWithLong.multiply(Long.MAX_VALUE, Long.MAX_VALUE);
    }

    @Test(expected = ArithmeticException.class)
    public void testOverflowMin() {
        OverflowingWithLong.multiply(Long.MIN_VALUE, Long.MIN_VALUE);
    }

    @Test(expected = ArithmeticException.class)
    public void testOverflowMaxMin() {
        OverflowingWithLong.multiply(Long.MAX_VALUE, Long.MIN_VALUE);
    }

    @Test(expected = ArithmeticException.class)
    public void testOverflow1() {
        OverflowingWithLong.multiply(119537721L, 77158673929L); // -> Long.MAX_VALUE + 2
    }

    @Test(expected = ArithmeticException.class)
    public void testOverflow2() {
        OverflowingWithLong.multiply(-2761311370L, 3340214413L); // -> Long.MIN_VALUE - 2
    }
}
