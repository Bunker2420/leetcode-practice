import java.util.Scanner;

public class practice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int max = 0;
        while ( n>0) {
            sum = n % 10;
            if(sum % 2 == 1)
            {
                if(sum > max)
                {
                    System.out.println(sum);
                    max = sum;
                }
            }
            n = n/10;
        }
        System.out.println(max);
    }
}
