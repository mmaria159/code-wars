package kata7kyu;

import com.mariamacovei.kata7kyu.MostFrequentItemCount;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MostFrequentItemCountTest {
    @Test
    public void tests() {
        assertEquals(2, MostFrequentItemCount.mostFrequentItemCount(new int[] {3, -1, -1}));
        assertEquals(5, MostFrequentItemCount.mostFrequentItemCount(new int[] {3, -1, -1, -1, 2, 3, -1, 3, -1, 2, 4, 9, 3}));
    }
}