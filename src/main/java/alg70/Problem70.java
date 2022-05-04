package alg70;
import java.util.ArrayList;
import java.util.List;

public class Problem70 {
    char x;
    public Character getChar(){
        return x;
    }
    //List<Character> n;
    public int get_perfect_num(List l){
        int tmp = 0;
        for(Object character: l){
            tmp += (int)character;
        }

        int result = ((int)getChar() * 10) + (10 - tmp);
        return result;
    }
    public static void main(String[] args){
        System.out.println("Problem no. 70");
        List<Character> chars = new ArrayList<>();
        Problem70 pr70 = new Problem70();
        System.out.println(pr70.get_perfect_num(chars));
    }
}
