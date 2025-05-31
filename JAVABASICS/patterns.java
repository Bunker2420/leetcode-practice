public class patterns {
    public static void main(String[] args) {
        for(int line=4;line>=1;line--)
        {
            for(int star=1;star<=line;star++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

        // or second method
        int n = 4;
        for(int i = 1;i<=n;i++)
        {
            for(int j=1;j<=(n-i+1);j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        // half pyramid
        for(int i =1;i<=4;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
        // Character patterns
        int lines = 4;
        char ch = 'A';
        for(int i = 1;i<=lines;i++)
        {
            for(int j = 1;j<=i;j++)
            {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
