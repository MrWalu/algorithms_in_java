package alg165;

import java.util.ArrayList;
import java.util.List;

public class Problem165 {
    public static List<Integer> getSmallerRight(){
        List nums = List.of(3, 4, 9, 6, 1);
        List<Integer> smaller = new ArrayList<>();
        for(int i = 0; i<nums.size(); i++){
            int counter = 0;
            for(int j = i+1; j<nums.size(); j++){
                if ((int)nums.get(j) < (int)nums.get(i)){
                    counter++;
                }
            }
            smaller.add(counter);
        }
        return smaller;
    }
    public static void main(String[] args){
        System.out.println("Problem no. 165");
        Problem165 pr165 = new Problem165();
        System.out.println(pr165.getSmallerRight());
    }
}
