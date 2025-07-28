package Arrays;

public class kadanemaxsumalgo {
    public static void kadane(int arr[])
    {
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++)
        {
            currsum = currsum + arr[i];
            if(currsum < 0)
            {
                currsum = 0;
            }
            if(currsum > maxsum)
            {
                maxsum = currsum;
            }
        }
        System.out.println("The maximum sub array using kadane algorithm is "+maxsum);
    }
    public static void negkadane(int arr[])
    {
        int maxsum = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] > maxsum)
            {
                maxsum = arr[i];
            }
        }
        System.out.println("The maximum subarray sum using kadane algorithm is "+maxsum);
    }
    public static void main(String[] args) {
        int arr[] = {-1,-2,-3,-4,-5,-6,-7};
        boolean track = false;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] > 0)
            {
                track = true;
                break;
            }
        }
        if(track)
        {
            kadane(arr);
        }
        else
        {
            negkadane(arr);
        }
    }
}
