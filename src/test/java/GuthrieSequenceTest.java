import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GuthrieSequenceTest {

    @Test
    void testIsGuthrieSequence(){
        int [] arr = {8, 4, 2, 1};
        int [] arr1 = {8, 17, 4, 1};
        int [] arr2= {8,4,1};
        int [] arr3= {8,4,2};

        assertEquals(1,GuthrieSequence.isGuthrieSequence(arr));
        assertEquals(0,GuthrieSequence.isGuthrieSequence(arr1));
        assertEquals(0,GuthrieSequence.isGuthrieSequence(arr2));
        assertEquals(0,GuthrieSequence.isGuthrieSequence(arr3));
    }

}
