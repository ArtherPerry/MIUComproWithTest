import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class SquarePairTest {


    @Test
    void testSquarePair(){
        int [] arr = {11, 5, 4, 20};
        int [] arr1  = {9, 0, 2, -5, 7};
        int [] arr2 = {9};

        assertEquals(3,SquarePair.countSquarePair(arr));
        assertEquals(2,SquarePair.countSquarePair(arr1));
        assertEquals(0,SquarePair.countSquarePair(arr2));

    }

    @Test
    void  testIsPerfectSquare(){
        assertTrue(SquarePair.isPerfectSquare(4));
        assertTrue(SquarePair.isPerfectSquare(9));
        assertFalse(SquarePair.isPerfectSquare(8));
        assertFalse(SquarePair.isPerfectSquare(5));
    }
}
