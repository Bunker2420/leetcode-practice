
import java.util.Scanner;

class fibonaccileet509
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the fibonacci number you want");
        int n = sc.nextInt();
        int x = 0;
        int y = 1;
        int sum = 0;
        if(n == 1)
        {
            sum = 1;
        }
        for(int i = 1;i<n;i++)
        {
            sum = x + y;
            x = y;
            y = sum;
        }
        System.out.println(sum);
    }
}