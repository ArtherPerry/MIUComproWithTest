import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class NUniqueTest {

    @Test
    void testIsNUnique(){
        int [] arr = {7, 3, 3, 2, 4};
        int [] arr1 = {1};
        assertEquals(1,NUnique.isNUnique(arr,11));
        assertEquals(0,NUnique.isNUnique(arr,6));
        assertEquals(0,NUnique.isNUnique(arr,10));
        assertEquals(0,NUnique.isNUnique(arr,8));
        assertEquals(0,NUnique.isNUnique(arr,4));
        assertEquals(0,NUnique.isNUnique(arr1,4));
    }
}
