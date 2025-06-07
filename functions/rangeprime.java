class rangeprime
{
    public static boolean Prime(int n)
    {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0)
            {
               return false;
            }
        }
        return true;
    }
    public static void range(int n)
    {
       for (int i = 1; i <=n; i++) {
           boolean res = Prime(i);
           if(res == false)
           {
             continue;
           }
           System.out.println(i);
       }
    }
    public static void main(String[] args) {
        range(150);
    }
}