import java.util.Scanner;

public class leet4countmatches1688 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int matches = 0;
        while(n > 1)
        {
            if(n % 2 == 0)
            {
                matches = matches + n / 2;
                n = n / 2;
            }
            else
            {
                matches = matches + (n - 1) / 2 ;
                n = (n - 1) / 2 + 1;
            }
        }
        System.out.println(matches);
    }
}
