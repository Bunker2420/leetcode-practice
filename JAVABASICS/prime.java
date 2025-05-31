import java.util.*;
public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input number :");
        int n = sc.nextInt();
        boolean f = true;
        if (n <= 1) {
            System.out.println(n + " is not a prime number");
            return;
        }
        for(int i = 2;i<n;i++)
        {
            if(n % i == 0)
            {
                System.out.println(n+"n is not a prime number");
                f = false;
                break;
            }
        }
        if(f == true)
        {
            System.out.println(n+"The value n is prime number");
        }
    }
}
