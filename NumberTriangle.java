public class NumberTriangle {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            int x = (i % 2 == 0) ? 0 : 1;
            int y = 1 - x;
            
            for (int j = 1; j <= i; j++) {
                System.out.print(x); 
                int temp = x;
                x = y;
                y = temp;
            }
            System.out.println();
        }
    }
}
