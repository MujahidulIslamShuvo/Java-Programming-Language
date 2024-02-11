public class Array_buy_sell_Stocks {
    public static int buySellstocks(int prices[]){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfite = 0;
        for(int i = 0; i<prices.length;i++){
            if(buyPrice<prices[i]){
                int profit = prices[i]-buyPrice;//today profite
                maxProfite = Math.max(maxProfite, profit);//max profite for the 6 day 0r Array
            }else{
                buyPrice = prices[i];//if i hade loss in selling stocks
            }
        }
        return maxProfite;
    }
    public static void main(String[] args) {
        int prices [] ={7,1,5,3,6,4};
        System.out.println(buySellstocks(prices));
    }
}
   