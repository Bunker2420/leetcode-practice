public class hollowrectangle {
    public static void main(String[] args) {
        int n = 4;
        for(int i = 1;i<=n;i++)
        {
            for(int j = 1;j<= n+1;j++)
            {
                if (i == 2 || i == 3) {
                    if(j == 2 || j == 3 || j == 4)
                    {
                        System.out.print(" ");
                        continue;
                    }
                    else
                    {
                        System.out.print("*");
                    }
                }
                else
                {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
