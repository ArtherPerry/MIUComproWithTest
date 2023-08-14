import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class IsSquareTest {


    @Test
    void testIsSquare(){
        assertEquals(1,IsSquare.isSquare(0));
        assertEquals(1,IsSquare.isSquare(4));
        assertEquals(1,IsSquare.isSquare(25));
        assertEquals(0,IsSquare.isSquare(-4));
        assertEquals(0,IsSquare.isSquare(8));
    }
}
