import java.util.Scanner;

public class PRACTICE {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       
       int sum = 0;
       for(int i=1;i<=4;i++)
       {
        sum = sum + n % 10;
        n = n/10;
       }
       System.out.println(sum);
    }
}
