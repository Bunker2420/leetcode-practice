package Arrays;

public class leetcodetrappingwater {
    public static void trapwater(int arr[])
    {
        int lb[] = new int[arr.length];
        int rb[] = new int[arr.length];
        int waterlevel = 0;
        int trappedwater = 0;
        int width = 1;
        lb[0] = arr[0];
        for(int i=1;i<arr.length;i++)
        {
            lb[i] = Math.max(arr[i],lb[i-1]);   
        }
        int n = arr.length;
        rb[n-1] = arr[n-1];
        for(int i=n-2;i>=0;i--)
        {
            rb[i] = Math.max(arr[i], rb[i+1]);
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(lb[i]+" ");
            System.out.print(rb[i]+" ");
            waterlevel = Math.min(lb[i], rb[i]);
            trappedwater = trappedwater + (waterlevel - arr[i]) * width;
        }
        System.out.println("The volume of trapped water is "+trappedwater);
    }
    public static void main(String[] args) {
        int arr[] = {4,2,0,6,3,2,5};
        trapwater(arr);
    }
}
