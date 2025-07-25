package Arrays;

public class linearsearch {
    public static void LinSearch(int arr[],int key)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] == key)
            {
                System.out.println("key found "+arr[i]+ " at index "+i);
                break;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10,12,14};
        int key = 10;
        LinSearch(arr, key);
    }
}
