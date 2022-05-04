package alg109;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Problem109Test {
    @Test
    public void isSwapChangingNumbers(){
        assertEquals(255, Problem109.swapBits(255));
        assertEquals(0, Problem109.swapBits(0));
        assertEquals(225, Problem109.swapBits(210));
        assertEquals(85, Problem109.swapBits(170));
        assertEquals(209, Problem109.swapBits(226));
    }
}
