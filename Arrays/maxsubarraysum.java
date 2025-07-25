package Arrays;
import java.util.*;;

public class maxsubarraysum {
    public static void SUB(int arr[])
    {
        int count = 0;
        int maxsum = Integer.MIN_VALUE;
        int minsum = Integer.MAX_VALUE;
        int sum;
        for(int i = 0;i<arr.length;i++)
        {
            for(int j=i+1;j<=arr.length;j++)
            {
                sum = 0;
                for(int k=i;k<j;k++)
                {
                    System.out.print(arr[k]+" ");
                    sum = sum + arr[k];
                    if(sum > maxsum)
                    {
                        maxsum = sum;
                    }
                    if(sum < minsum)
                    {
                        minsum = sum;
                    }
                }
                count++;
                System.out.println();
            }
        }
        System.out.println("The maximum sub array sum is "+maxsum);
        System.out.println("The minimum sub array sum is "+minsum);
        System.out.println("The number of sub arrays in the array are "+count);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        SUB(arr);
    }
}
