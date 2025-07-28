package Arrays;

public class leetcodebuyandsellstock {
    public static void stockprofit(int arr[]) // O(n2)
    {
        int profit = 0;
        int maxprofit = 0;
        for(int i = 0;i<arr.length;i++)
        {
            for(int j =i+1;j<arr.length;j++)
            {
                profit = arr[j] - arr[i];
                maxprofit = Math.max(maxprofit, profit);
            }
        }
        System.out.println("The maximum profit of buying and selling stocks is "+maxprofit);
    }
    public static void stockprof(int arr[]) // O(n)
    {
        int buyingprice = Integer.MAX_VALUE;
        int profit = 0;
        int maxprofit = 0;
        for(int i=0;i<arr.length;i++)
        {
            if(buyingprice < arr[i])
            {
                profit = arr[i] - buyingprice;
                maxprofit = Math.max(maxprofit, profit);
            }
            else
            {
                buyingprice = arr[i];
            }
        }
        System.out.println("The maximum profit of buying and selling stocks is "+maxprofit);
    }
    public static void main(String[] args) {
        int arr[] = {7,1,10,3,6,4};
        stockprofit(arr);
        stockprof(arr);
    }
}

