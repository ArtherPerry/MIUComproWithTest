import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class PrimeCountTest {

    @Test
    void testPrimeCount(){
        assertEquals(6,PrimeCount.primeCount(10,30));
        assertEquals(6,PrimeCount.primeCount(11,29));
        assertEquals(0,PrimeCount.primeCount(20,22));
        assertEquals(0,PrimeCount.primeCount(1,1));
        assertEquals(1,PrimeCount.primeCount(5,5));
        assertEquals(0,PrimeCount.primeCount(6,2));
        assertEquals(3,PrimeCount.primeCount(-10,6));
    }

    @Test
    void testIsPrime(){
        assertTrue(PrimeCount.isPrime(2));
        assertTrue(PrimeCount.isPrime(3));
        assertTrue(PrimeCount.isPrime(5));
        assertTrue(PrimeCount.isPrime(7));
        assertFalse(PrimeCount.isPrime(4));
        assertFalse(PrimeCount.isPrime(6));
        assertFalse(PrimeCount.isPrime(8));
    }

}
