import java.util.Scanner;

public class leet5numberofstepstozero1342 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();
        int i = 0;
        while(n>0)
        {
            if(n%2 == 0)
            {
                n = n / 2;
            }
            else{
                n = n -1;
            }
            i++;
        }
        System.out.println(i);
    }
}
