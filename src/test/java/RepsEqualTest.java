import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class RepsEqualTest {

    @Test
    void testRepsEqual(){
        int [] arr = {3, 2, 0, 5, 3};
        int [] arr1 = {0,3, 2, 0, 5, 3};
        int [] arr2 = {3, 2, 0, 5};
        int [] arr3 = {3, 2, 0, 5, 3,4};
        int [] arr4 ={2,3,0,5,3};
        int [] arr5 = {9,3,1,1,2};
        int num = 32053;
        assertEquals(1,RepsEqual.repsEqual(arr,num));
        assertEquals(1,RepsEqual.repsEqual(arr1,num));
        assertEquals(0,RepsEqual.repsEqual(arr2,num));
        assertEquals(0,RepsEqual.repsEqual(arr3,num));
        assertEquals(0,RepsEqual.repsEqual(arr4,num));
        assertEquals(0,RepsEqual.repsEqual(arr5,num));


    }
}
