public class Butterflypattern {
    public static void main(String[] args) {
        int  n = 8;
        for(int i = 1;i<=n;i++)
        {

            for(int j = 1;j<=n;j++)
            {
                if(i == 1 || i == 8)
                {
                    if(j == 2 || j == 3 || j == 4 || j == 5 || j == 6 || j== 7)
                    {
                        System.out.print(" ");
                        continue;
                    }
                }
                if(i == 2 || i == 7)
                {
                    if(j == 3 || j == 4 || j == 5 || j == 6)
                    {
                        System.out.print(" ");
                        continue;
                    }
                }
                if(i == 3 || i == 6)
                {
                    if(j == 4 || j == 5)
                    {
                        System.out.print(" ");
                        continue;
                    }
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
