import java.util.Scanner;

public class leet1countoddnumbers1523 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int low = sc.nextInt();
        int high = sc.nextInt();
        int count = 0;
        for(int i = low;i<=high;i++)
        {
            if(i%2 == 1)
            {
                System.out.println(i);
                count++;
            }
        }
        System.out.println("There are "+ count + " odd numbers");
    }
}
