class callbyvalue
{
    public static void CALLBYVALUE(int a,int b)
    {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a inside method copy is "+a);
        System.out.println("b inside method copy is "+b);
    }
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        CALLBYVALUE(a, b);
        System.out.println("a main value is "+a);
        System.out.println("b main value is "+b);
    }
}