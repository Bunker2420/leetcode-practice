
import java.util.Scanner;

class powerofthreeleet326
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        if(n<0)
        {
            System.out.println("n is not a power of 3 and negative");
        }
        boolean decide = false;
        for(int i = 0;i<=19;i++)
        {
            int value = (int)Math.pow(3, i);
            System.out.println(value);
            if(n == value)
            {
                decide = true;
                break;
            }
        }
        if(decide == true)
        {
            System.out.println("n is power of 3 "+n);
        }
        else
        {
            System.out.println("n is not a power of 3");
        }
    }
}