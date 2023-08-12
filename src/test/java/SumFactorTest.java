import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class SumFactorTest {

    @Test
    void testSumFactor(){
        int [] arr = {3, 0, 2, -5, 0};
        int [] arr1 = {9, -3, -3, -1, -1};
        int [] arr2 = {1};
        int [] arr3 = {0, 0, 0};

        assertEquals(2,SumFactor.sumFactor(arr));
        assertEquals(0,SumFactor.sumFactor(arr1));
        assertEquals(1,SumFactor.sumFactor(arr2));
        assertEquals(3,SumFactor.sumFactor(arr3));

    }

}
