package kata7kyu;

import com.mariamacovei.kata7kyu.AnagramDetection;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AnagramDetectionTest {
    @Test
    public void exampleTests() {
        AnagramDetection k = new AnagramDetection();

//        assertEquals(true, k.isAnagram("foefet", "toffee"));
//        assertEquals(true, k.isAnagram("Buckethead", "DeathCubeK"));
//        assertEquals(true, k.isAnagram("Twoo", "Woot"));
        assertEquals(false, k.isAnagram("apple", "pale"));
    }
}
