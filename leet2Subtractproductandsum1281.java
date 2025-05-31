import java.util.Scanner;

public class leet2Subtractproductandsum1281 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int product = 1;
        int sum = 0;
        while(n>0)
        {
            sum = sum + n % 10;
            product = product * (n % 10);
            n = n/10;
        }
        System.out.println(sum);
        System.out.println(product);
        int subtract = product - sum;
        System.out.println(subtract);
    }
}
