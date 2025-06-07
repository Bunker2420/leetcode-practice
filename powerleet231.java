
import java.util.Scanner;

class powerleet231
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:-");
        int n = sc.nextInt();
        int power = 0;
        boolean decide = false;
        for(int i = 0;i<=n;i++)
        {
            int value = (int)Math.pow(2,i);
            System.out.println(value);
            if(n == value)
            {
                decide = true;
                break;
            }
            power++;
        }
        if(decide == true)
        {
            System.out.println("Equal");
        }
        else
        {
            System.out.println("false");
        }

    }
}