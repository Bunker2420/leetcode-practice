package Arrays;

public class arraytriplet0 {
    public static void Triplet(int arr[])
    {
        int newarr[] = new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
           for(int j=i+1;j<arr.length;j++)
           {
            for(int k=j+1;k<arr.length;k++)
            {
                if(arr[i]+arr[j]+arr[k] == 0)
                {
                    for(int p =0;p<arr.length;p++)
                    {
                        
                    }
                    System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
                }
            }
           }
        }
    }
    public static void main(String[] args) {
        int arr[] = {-1,0,1,2,-1,-4};
        Triplet(arr); 
    }
}
