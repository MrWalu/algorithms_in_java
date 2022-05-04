/*//////////////////////////////////////////////////////
Given a array of numbers representing the stock prices
of a company in chronological order, write a function
that calculates the maximum profit you could have made
from buying and selling that stock once.
You must buy before you can sell it.
For example, given [9, 11, 8, 5, 7, 10], you should
return 5, since you could buy the stock at 5 dollars
and sell it at 10 dollars.
///////////////////////////////////////////////////// */

package alg47;

import java.util.List;

public class Problem47{
    public int get_stock_profit() throws IllegalAccessException {
        List<Integer> prices = List.of(9, 11, 8, 5, 7, 10);
        int price = 0;
        if(prices.isEmpty() == true || prices.size()>2){
            throw new IllegalAccessException("There must be at least 2 values to compare");
        }
        int min_price = prices.get(0);
        int max_diff = 0;
        for(Integer p: prices){
            if(p - min_price>max_diff)
                max_diff = p - min_price;
            if(p<min_price)
                min_price = p;
        }
        return max_diff;
    }

    public static void main(String[] args) throws IllegalAccessException{
        System.out.println("Problem no. 47");
        Problem47 pr47 = new Problem47();
        System.out.println(pr47.get_stock_profit());
    }

}
