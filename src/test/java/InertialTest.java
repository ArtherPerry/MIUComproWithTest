import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class InertialTest {
    int [] arr = {1};
    int [] arr2 = {2};
    int [] arr3 = {1,2,3,4};
    int [] arr4 = {-2,-4,-6,-8,-11};
    int [] arr5 = {2,3,5,7};
    int [] arr6 = {2,4,6,8,10};
    int [] arr7 = {1,1,1,1,1,1,2};
    int [] arr8= {2,12,4,6,8,11};
    int [] arr9 = {2,12,12,4,6,8,11};

    @Test
    void testInertial(){
        assertEquals(0,Inertial.isInertial(arr));
        assertEquals(0,Inertial.isInertial(arr2));
        assertEquals(0,Inertial.isInertial(arr3));
        assertEquals(0,Inertial.isInertial(arr4));
        assertEquals(0,Inertial.isInertial(arr5));
        assertEquals(0,Inertial.isInertial(arr6));
        assertEquals(1,Inertial.isInertial(arr7));
        assertEquals(1,Inertial.isInertial(arr8));
        assertEquals(1,Inertial.isInertial(arr9));
    }
    @Test
    void testIsOddGreater(){
        assertTrue(Inertial.isOddGreater(arr8,11));
        assertTrue(Inertial.isOddGreater(arr9,11));
    }
}
