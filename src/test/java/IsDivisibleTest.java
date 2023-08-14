import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class IsDivisibleTest {

    @Test
    void testIsDivisible(){
        int [] arr = {3, 3, 6, 36};
        int [] arr1 = {4};
        int [] arr2= {3, 4, 3, 6, 36};
        int [] arr3=  {6, 12, 24, 36};
        int [] arr4 = {};
        assertEquals(1,IsDivisible.isDivisible(arr,3));
        assertEquals(1,IsDivisible.isDivisible(arr1,2));
        assertEquals(0,IsDivisible.isDivisible(arr2,3));
        assertEquals(0,IsDivisible.isDivisible(arr3,12));
        assertEquals(1,IsDivisible.isDivisible(arr4,12));
    }
}
