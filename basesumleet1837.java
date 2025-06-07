
import java.util.Scanner;

class basesumleet1837
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number and type you want to convert");
        int n = sc.nextInt();
        int k = sc.nextInt();
        int power = 0; 
        int res  = 0 ; 
        int rem = 0;
        while(n>0)
        {
            rem = n % k;
            res = res + rem * (int)Math.pow(10, power);
            n = n / k;
            power++;
            System.out.println(" "+rem+" "+res);
        }
        System.out.println(res);
        int sum = 0;
        while(res>0)
        {
            sum = sum + (res % 10);
            res = res / 10;
        }
        System.out.println(sum);
    }
}