
import java.util.Scanner;

class dectobin
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the decimal number :-");
        int decnum = sc.nextInt();
        int  n = decnum;
        int binnum = 0;
        int rem = 0;
        int power = 0;
        while (n>0) { 
            rem = n % 2;
            n = n / 2;
            binnum = binnum + rem * (int)Math.pow(10, power);
            power++;
        }
        System.out.println(binnum);
    }
}