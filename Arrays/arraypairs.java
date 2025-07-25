package Arrays;

public class arraypairs {
    public static void Pairs(int arr[])
    {
        int count = 0;
        for(int i=0;i<=arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                System.out.print(arr[i]+","+arr[j]+" ");
                count++;
            }
            System.out.println();
        }
        System.out.println("There are total "+count+" array pairs possible in the array");
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        Pairs(arr);
    }
}
