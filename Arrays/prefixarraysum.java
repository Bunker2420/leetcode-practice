package Arrays;

public class prefixarraysum {
    public static void Prefix(int arr[])
    {
        int prefix[] = new int[arr.length];
        int sum = 0;
        int maxsum = 0;
        int currsum = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++)
        {
            sum = sum + arr[i];
            prefix[i] = sum;
        }
        for(int i = 0;i<arr.length;i++)
        {
            for(int j=i;j<arr.length;j++)
            {
                currsum = (i == 0) ? prefix[j] : prefix[j] - prefix[i-1];
                if(currsum > maxsum)
                {
                    maxsum = currsum;
                }
            }
        }
        System.out.println("The maximum subarray sum is "+maxsum);
    }
    public static void main(String[] args) {
        int arr[] = {1,-2,3,-4,5,-6};
        Prefix(arr);
    }
}
