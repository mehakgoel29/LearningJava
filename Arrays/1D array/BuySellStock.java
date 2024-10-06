public class BuySellStock {
    /*
    You are given an array prices where prices[i] is the price of a given stock on the ith day.
    You want to maximize your profit by choosing a single day to buy one stock and choosing a
    different day in the future to sell that stock.
    Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
   */
    public static void main(String[] args) {
      int[] price={7,1,5,3,6,4};
        System.out.println(calMaxProfit(price));
    }
    static int calMaxProfit(int[] price){
        int maxProfit = 0;
        int bestBuy=price[0]; //this cannot be a selling day
        for (int i = 0; i < price.length; i++) {
            if(price[i]>bestBuy){
                int profitForDay=price[i]-bestBuy;
                maxProfit=Math.max(maxProfit,profitForDay);
            }
            bestBuy=Math.min(bestBuy,price[i]);
        }
        return maxProfit;
    }
}
