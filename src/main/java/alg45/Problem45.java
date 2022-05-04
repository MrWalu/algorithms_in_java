/*////////////////////////////////////////////////////////
Using a function rand5() that returns an integer from
1 to 5 (inclusive) with uniform probability, implement
a function rand7() that returns an integer
from 1 to 7 (inclusive).
/////////////////////////////////////////////////////// */

package alg45;

import java.util.Random;

public class Problem45 {
    Random generator = new Random();
    public int rand5(){
        int number = generator.nextInt(5)+1;
        return number;
    }

    public int rand7(){
        int i = 5*rand5() + rand5() - 5;
        if (i < 22){
            return i%7+1;
        }
        return rand7();
    }

    public static void main(String[] args){
        System.out.println("Problem no. 45");
        Problem45 pr45 = new Problem45();
        System.out.println(pr45.rand7());
    }

}
