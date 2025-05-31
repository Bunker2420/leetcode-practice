import java.util.Scanner;

public class leet3palindrome9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input number:");
        int n = sc.nextInt();
        int num = n;
        int val = 0;
        if(num < 0)
        {
            while (num<0) {
            val = (val * 10) + num % 10;
            num = num / 10;
        }
        }
        while (num>0) {
            val = (val * 10) + num % 10;
            num = num / 10;
        }
        System.out.println(val);
        boolean answer = (n == val) ? true : false ;
        System.out.println(answer);
    }
}
