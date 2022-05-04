package alg165;

import alg118.Problem118;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class Problem165Test {
    @Test
    public void isTheListCorrect(){
        List<Integer> result = List.of(1,1,2,1,0);
        assertEquals(result , Problem165.getSmallerRight());
    }
}
