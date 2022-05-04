/*/////////////////////////////////////////////////////////////////
This problem was asked by Google.Given a sorted list of integers,
square the elements and give the output in sorted order.
For example, given [-9, -2, 0, 2, 3], return [0, 4, 4, 9, 81].
////////////////////////////////////////////////////////////// */

package alg118;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Problem118 {
    //List<Integer> nums = Arrays.asList(-9, 2, 0, -2, -3);
    public static List<Integer> powerList(){
        List<Integer> nums = Arrays.asList(-9, 2, 0, -2, -3);
        Collections.sort(nums);
        System.out.println("Pierwotna lista posortowana:");
        for(Integer n: nums){
            System.out.print(n+" ");
        }
        List<Integer> powered = new ArrayList<>();
        for(Integer n: nums){
            n *= n;
            powered.add(n);
        }
        Collections.sort(powered);
        System.out.println("\nLista po potegowaniu posortowana:");
        return powered;
    }

    public static void main(String[] args){
        System.out.println("Problem no. 118");
        Problem118 pr118 = new Problem118();
        System.out.println(pr118.powerList());
    }

}
