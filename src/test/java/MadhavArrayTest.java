import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MadhavArrayTest {

    @Test
    void testMadhavArray(){
        int [] arr = {2, 1, 1};
        int [] arr1 = {2, 1, 1, 4, -1, -1};
        int [] arr2 = {6, 2, 4, 2, 2, 2, 1, 5, 0, 0};
        int [] arr3 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, -2, - 1};
        int [] arr4 = {-6, -3, -3, 8, -5, -4};
        int [] arr5 = {3, 1, 2, 3, 0};
        int [] arr6 = {18, 9, 10, 6, 6, 6};

        assertEquals(1,MadhavArray.isMadhavArray(arr));
        assertEquals(1,MadhavArray.isMadhavArray(arr1));
        assertEquals(1,MadhavArray.isMadhavArray(arr2));
        assertEquals(1,MadhavArray.isMadhavArray(arr3));
        assertEquals(0,MadhavArray.isMadhavArray(arr4));
        assertEquals(0,MadhavArray.isMadhavArray(arr5));
        assertEquals(0,MadhavArray.isMadhavArray(arr6));

    }
}
