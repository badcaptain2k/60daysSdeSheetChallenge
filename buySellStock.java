import java.util.Arrays;

public class buySellStock {
    public static void main(String[] args) {
        int arr[]={7,1,4,6,9,2};
        System.out.println(Arrays.toString(arr));
        System.out.println(maxProfit(arr));
    }
    public static int maxProfit(int[] prices) {
        int minValue = Integer.MAX_VALUE;
        int profit = 0;
        for(int i =0; i<prices.length; i++){
            if(prices[i] < minValue)
                minValue = prices[i];
            else if((prices[i]-minValue) > profit)
                profit = prices[i] - minValue;

        }

        return profit;
    }
}
