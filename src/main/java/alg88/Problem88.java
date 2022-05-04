/*////////////////////////////////////////////////
Implement division of two positive integers
without using the division, multiplication,
or modulus operators. Return the quotient as
an integer, ignoring the remainder.
//////////////////////////////////////////////// */

package alg88;

public class Problem88 {
    public static int dividing(int dividend, int divisor){
        int current_sum = 0;
        int quotient = 0;
        while(current_sum <= dividend){
            quotient += 1;
            current_sum += divisor;
        }
        return (quotient-1);
    }

    public static void main(String[] args){
        System.out.println("Problem no. 88");
        Problem88 pr88 = new Problem88();
        System.out.println(pr88.dividing(12,3));
        System.out.println(pr88.dividing(13,3));
        System.out.println(pr88.dividing(1,1));
    }
}
