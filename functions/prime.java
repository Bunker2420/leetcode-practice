
import java.util.Scanner;

class prime
{
    public static void Prime(int n)
    {
        boolean v = false;
         if (n <= 1) {
            System.out.println("Given number is not a prime number => " + n);
            return;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(n%i == 0)
            {
                v = true;
                break;
            }
        }
        if(v == true)
        {
            System.out.println("Given number is not a prime number => "+n);
        }
        else
        {
            System.out.println("Given number is a prime number =>"+n);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number n:-");
        int n = sc.nextInt();
        Prime(n);
    }
}