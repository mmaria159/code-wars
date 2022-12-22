package kata8kyu;

import com.mariamacovei.kata8kyu.CountOfPositives;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class CountOfPositivesTest {
    @Test
    public void countPositivesSumNegatives_BasicTest() {
        int[] expectedResult = new int[]{10, -65};
        assertArrayEquals(expectedResult, CountOfPositives.countPositivesSumNegatives(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15}));
    }

    @Test
    public void countPositivesSumNegatives_InputWithZeroes() {
        int[] expectedResult = new int[]{8, -50};
        assertArrayEquals(expectedResult, CountOfPositives.countPositivesSumNegatives(new int[]{0, 2, 3, 0, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14}));
    }


    @Test
    public void countPositivesSumNegatives_InputWithNull() {
        int[] expectedResult = new int[0];
        assertArrayEquals(expectedResult, CountOfPositives.countPositivesSumNegatives(null));
    }
}
