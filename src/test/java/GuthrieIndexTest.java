import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class GuthrieIndexTest {

    @Test
    void testGuthrieIndex(){
        assertEquals(0,GuthrieIndex.guthrieIndex(1));
        assertEquals(1,GuthrieIndex.guthrieIndex(2));
        assertEquals(7,GuthrieIndex.guthrieIndex(3));
        assertEquals(2,GuthrieIndex.guthrieIndex(4));
        assertEquals(8,GuthrieIndex.guthrieIndex(42));
    }
}
