package alg88;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem88Test {
    @Test
    public void isDividingResultCorrect(){
        assertEquals(4, Problem88.dividing(12,3));
        assertEquals(1, Problem88.dividing(1,1));
        assertEquals(0, Problem88.dividing(0,1));
        assertEquals(4, Problem88.dividing(13,3));
        assertEquals(5, Problem88.dividing(25,5));
        assertEquals(3, Problem88.dividing(25,7));
    }
}
