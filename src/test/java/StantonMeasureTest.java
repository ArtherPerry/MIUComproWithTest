import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class StantonMeasureTest {

    @Test
    void testStantonMeasure(){
        int [ ] arr = {1};
        int [ ] arr1 = {0};
        int [] arr2 = {3,1,1,4};
        int [] arr3 = {1, 3, 1, 1, 3, 3, 2, 3, 3, 3, 4};
        int [] arr4 = {};
        assertEquals(1,StantonMeasure.stantonMeasure(arr));
        assertEquals(1,StantonMeasure.stantonMeasure(arr1));
        assertEquals(0,StantonMeasure.stantonMeasure(arr2));
        assertEquals(6,StantonMeasure.stantonMeasure(arr3));
        assertEquals(0,StantonMeasure.stantonMeasure(arr4));
    }
}
