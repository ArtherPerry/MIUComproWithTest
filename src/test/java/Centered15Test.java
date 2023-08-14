import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class Centered15Test {

    @Test
    void testIsCentered15(){
        int [] arr = {3, 2, 10, 4, 1, 6, 9};
        int [] arr2 = {9, 15, 6};
        int [] arr3= {1, 1, 15 -1,-1};
        int [] arr4 = {2, 10, 4, 1, 6, 9};
        int [] arr5 = {3, 2, 10, 4, 1, 6};
        int [] arr6 = {1,1,8, 3, 1, 1};
        int [] arr7 = {1, 1, 2, 2, 1, 1};
        assertEquals(1,Centered15.isCentered15(arr));
        assertEquals(1,Centered15.isCentered15(arr2));
        assertEquals(1,Centered15.isCentered15(arr3));
        assertEquals(0,Centered15.isCentered15(arr4));
        assertEquals(0,Centered15.isCentered15(arr5));
        assertEquals(1,Centered15.isCentered15(arr6));
        assertEquals(0,Centered15.isCentered15(arr7));

    }
}
