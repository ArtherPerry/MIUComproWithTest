import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class IsLegalNumberTest {

    @Test
    void testIsLegalNumber(){
        int [] arr = { 3,2,1};
        int [] arr1 = {3,7,1};
        assertEquals(1,IsLegalNumber.isLegalNumber(arr,4));
        assertEquals(0,IsLegalNumber.isLegalNumber(arr1,6));
    }
}
