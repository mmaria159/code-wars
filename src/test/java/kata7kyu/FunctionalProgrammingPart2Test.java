package kata7kyu;

import com.mariamacovei.kata7kyu.functionalprogrammingpart2.FunctionalProgrammingPart2;
import com.mariamacovei.kata7kyu.functionalprogrammingpart2.Triangle;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FunctionalProgrammingPart2Test {
    @Test
    public void testArea() throws Exception {
        Triangle t = new Triangle(5, 10);
        assertEquals("Incorrect area returned", 25D, FunctionalProgrammingPart2.f.applyAsDouble(t), 0.001);
        t.setArea(3D);
        assertEquals("Incorrect area in Triangle object", 25D, t.getArea(), 0.001);
    }
}
