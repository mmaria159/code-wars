package kata8kyu;

import com.mariamacovei.kata8kyu.AgeRangeCompatibility;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AgeRangeCompatibilityTest {

    @Test
    public void exampleTests() {
        assertEquals("15-20", AgeRangeCompatibility.datingRange(17));
        assertEquals("27-66", AgeRangeCompatibility.datingRange(40));
        assertEquals("14-16", AgeRangeCompatibility.datingRange(15));
        assertEquals("24-56", AgeRangeCompatibility.datingRange(35));
        assertEquals("9-11", AgeRangeCompatibility.datingRange(10));
    }
}
