package alg85;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem85Test {
    @Test
    public void isChoosingRightNumber(){
        assertEquals(3, Problem85.get_number(3,4,1));
        assertEquals(4, Problem85.get_number(3,4,0));
        assertEquals(2, Problem85.get_number(2,5,1));
    }

}
