/*///////////////////////////////////////////////////////////
Given an unsigned 8-bit integer, swap its even and odd bits.
The 1st and 2nd bit should be swapped,
the 3rd and 4th bit should be swapped, and so on.
 */
///////////////////////////////////////////////////////////*/
package alg109;

public class Problem109 {
    public static int swapBits(int number) {
        return ((number & 85) << 1) | ((number & (85 << 1)) >> 1);
    }
    public static void main(String[] args){
        System.out.println("Problem no. 109");
        Problem109 pr109 = new Problem109();
        System.out.println(pr109.swapBits(226));//209
        System.out.println(pr109.swapBits(170));//85
        System.out.println(pr109.swapBits(210));//225
    }
}


