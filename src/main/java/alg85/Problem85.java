/*///////////////////////////////////////////
Given three 32-bit integers x, y, and b,
return x if b is 1 and y if b is 0, using
only mathematical or bit operations.
You can assume b can only be 1 or 0.
///////////////////////////////////////// */

package alg85;

import static java.lang.Math.abs;

public class Problem85 {
    public static int get_number(int x, int y, int b){
        return x*b+y*abs(b-1);
    }
    public static void main(String[] args){
        System.out.println("Problem no. 85");
        Problem85 pr85 = new Problem85();
        System.out.println(pr85.get_number(3,4,1));
        System.out.println(pr85.get_number(2,5,0));
    }
}
