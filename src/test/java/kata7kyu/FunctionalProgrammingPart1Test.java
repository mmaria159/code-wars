package kata7kyu;

import com.mariamacovei.kata7kyu.functionalprogrammingpart1.FunctionalProgrammingPart1;
import com.mariamacovei.kata7kyu.functionalprogrammingpart1.Student;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class FunctionalProgrammingPart1Test {
    @Test
    public void testJohnSmith() throws Exception {
        Student jSmith = new Student("John", "Smith", "js123");
        assertTrue("John Smith with student number js123 did not return true", FunctionalProgrammingPart1.f.apply(jSmith));
    }
}
