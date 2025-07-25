package Arrays;

public class binarysearch {
    public static void Binsearch(int arr[],int key)
    {
        int start = 0;
        int end = arr.length - 1;
        int mid = 0;
        while(start<=end)
        {
            mid = (start + end) / 2;
            if(arr[mid] == key)
            {
                System.out.println("Number found at index "+mid);
                break;
            }
            if(arr[mid] > key)
            {
                end = mid - 1;
            }
            if(arr[mid] < key)
            {
                start = mid + 1;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        int key = 1;
        Binsearch(arr, key);
    }
}
