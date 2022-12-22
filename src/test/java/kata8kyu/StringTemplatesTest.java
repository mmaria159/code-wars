package kata8kyu;

import com.mariamacovei.kata8kyu.StringTemplates;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringTemplatesTest {
    @Test
    public void fixedTests() {
        assertEquals(StringTemplates.buildString("Cheese","Milk","Chocolate"),"I like Cheese, Milk, Chocolate!");
        assertEquals(StringTemplates.buildString("Cheese","Milk"),"I like Cheese, Milk!");
        assertEquals(StringTemplates.buildString("Chocolate"),"I like Chocolate!");
    }
}
