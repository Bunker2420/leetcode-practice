class homework
{
    public static void Average(int a,int b,int c)
    {
        float avg = (a + b + c) / 3;
        System.out.println("Average of the number is "+avg);
    }
    public static boolean isEven(int n)
    {
        if(n % 2 == 0)
        {
            return true;
        }
        return false;
    }
    public static void Palindrome(int n)
    {
        int pal = n;
        int revpal = 0;
        while(pal > 0)
        {
            revpal = (revpal * 10) + pal % 10;
            pal = pal / 10;
        }
        System.out.println(revpal);
        if(n == revpal)
        {
            System.out.println("Given number is a palindrome");
        }
        else
        {
            System.out.println("Not a palindrome");
        }
    }
     public static void Sum(int n)
    {
        int sum = 0;
        while(n > 0)
        {
            sum = sum + (n % 10);
            n = n / 10;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        // Average(15, 20, 25);
        // boolean res = isEven(25);
        // System.out.println("Result of isEven is "+res);
        // Palindrome(321);
        Sum(156);
    }
}