
import java.util.Scanner;

class bintodec
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the binary number :-");
        int binnumber = sc.nextInt();
        int n = binnumber;
        int res = 0;
        int power = 0;
        while(n>0)
        {
            res += n % 10 * (int)Math.pow(2, power);
            n = n / 10;
            power++;
        }
        System.out.println("Decimal number for the binary number "+binnumber+" is "+res);
    }
}