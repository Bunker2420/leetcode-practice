package Arrays;

public class reversearray {
    public static void Reverse(int arr[])
    {
        int start = 0;
        int end = arr.length - 1;
        int temp = 0;
        while (start<=end)
        {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;            
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {2,5,21,9,7,46};
        Reverse(arr);
    }
}
