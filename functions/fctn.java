
import java.util.Scanner;

class fctn
{
     public static void Hello()
        {
            System.out.println("Hello world");
        }
     public static void add(int a ,int b)
        {
            int sum = a + b;
            System.out.println("Sum is "+sum);
        }
    public static void product(int a ,int b)
        {
            int multi = a * b;
            System.out.println("product is "+multi);
        }
    public static void factorial(int n)
        {
            int fact = 1;
            for(int i = n;i>=1;i--)
            {
                fact = fact * i;
            }
            System.out.println("factorial of "+n+" is "+fact);
        }
    public static void main(String args[])
    {  
        Hello();  
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // add(a, b);
        // product(a, b);
        factorial(b);
    }
}