package kata8kyu;

import com.mariamacovei.kata8kyu.PushAnObjectIntoArray;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class PushAnObjectIntoArrayTest {

    @Test
    public void testSomething() {
        List<String> items = PushAnObjectIntoArray.push();
        assertEquals(1, items.size());
        assertEquals("an object", items.get(0));
    }
}
