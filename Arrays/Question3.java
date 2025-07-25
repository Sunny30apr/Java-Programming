import java.util.*;

public class Question3 {
    public static int maxStockProfit(int[] prices) {
        int maxProfit=0;
        int buyPrice=prices[0];
        
        for(int i=1; i<prices.length; i++) {
            int sellPrice=prices[i];
            int profit=0;
            if(sellPrice>buyPrice) {
                profit=sellPrice-buyPrice;
            }
            else {
                buyPrice=sellPrice;
            }
            maxProfit=Math.max(maxProfit, profit);
        }
        return maxProfit;
    } 

    public static void main(String args[]) {
        int prices[]={7,1,5,3,6,4};
        System.out.print(maxStockProfit(prices));
    }
}