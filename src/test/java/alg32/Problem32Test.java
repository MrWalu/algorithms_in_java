package alg32;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Problem32Test {
    @Test
    public void shouldAnswerWithTrue() {
        double[][] matrix1 = {
                {1,1},{1,1}
        };
        double[][] matrix2 = {
                {1,1},{2,1}
        };
        double[][] matrix3 = {
                {1, 1.28, 0.82},
                {0.78, 1, 0.65},
                {1.21, 1.55, 1}
        };
        assertTrue(Problem32.arbitrage(matrix2));
        assertTrue(Problem32.arbitrage(matrix3));
        assertFalse(Problem32.arbitrage(matrix1));
    }



}