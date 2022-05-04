package alg118;

import org.junit.Test;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class Problem118Test {
    @Test
    public void areThePowersCorrectAndInOrder(){
        List<Integer> list = List.of(0, 4, 4, 9, 81);
        assertEquals(list ,Problem118.powerList());
    }
}
