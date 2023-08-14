import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class HenryTest {

    @Test
    void testHenry(){
        assertEquals(502,Henry.henry(1,3));
    }

    @Test
    void testIsPerfectNumber(){
        assertTrue(Henry.isPerfectNumber(6));
        assertTrue(Henry.isPerfectNumber(28));
        assertFalse(Henry.isPerfectNumber(18));
    }
}
