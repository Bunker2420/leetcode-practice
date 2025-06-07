
import java.util.Scanner;

class binomial
{
    public static int fact(int n)
    {
        int res = 1;
        for(int i = n;i>=1;i--)
        {
            res = res * i;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n and r value of binomial coefficient");
        int n = sc.nextInt();
        int r = sc.nextInt();
        int sub = n-r;
        int nfactorial = fact(n);
        System.out.println("n factorial is "+nfactorial);
        int rfactorial = fact(r);
        System.out.println("r factorial is "+rfactorial);
        int subfactorial = fact(sub);
        System.out.println("sub factorial is "+subfactorial);
        float binoCoeff = nfactorial / (rfactorial * subfactorial);   
        System.out.println("Binomial coeffient of nCr where n: "+n+" and r: "+r+" is "+binoCoeff); 
    }
}