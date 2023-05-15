package Arrays;

public class StockPrice {
    
    public static int buySellStocks(int prices[]){
        int maxProfit = 0;
        int buyPrice = Integer.MAX_VALUE;

        for(int i=0; i<prices.length; i++){
            if(buyPrice<prices[i]){//profit
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            }
            else{
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }
    //better code
    public static int buySellStocks2(int prices[]){
        int Profit = 0;
        int buyPrice = prices[0];

        for(int i=1; i<prices.length; i++){
            if(buyPrice<prices[i]){//profit
                Profit = Math.max(Profit, prices[i] - buyPrice);
            }
            else{
                buyPrice = prices[i];
            }
        }
        return Profit;
    }
    public static void main(String args[]){
        int prices[] = {7,1,5,3,6,4};
        int prices2[] = {7,6,4,3,1};
        System.out.println(buySellStocks2(prices2));
    }
}
