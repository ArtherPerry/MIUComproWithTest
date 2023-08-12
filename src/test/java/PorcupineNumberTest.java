import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PorcupineNumberTest {

    @Test
    void testFindPorcupineNumber(){
        assertEquals(139,PorcupineNumber.findPorcupineNumber(138));
        assertEquals(139,PorcupineNumber.findPorcupineNumber(0));
        assertEquals(409,PorcupineNumber.findPorcupineNumber(139));
    }
    @Test
    void testIsPrime(){
        assertTrue(PorcupineNumber.isPrime(139));
        assertFalse(PorcupineNumber.isPrime(138));
    }
}
