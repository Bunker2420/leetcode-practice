 import java.util.*;

 public class java1
{
    public static void main(String args[])
    {
       Scanner input = new Scanner(System.in);
       float pencilCost = input.nextFloat();
       float penCost = input.nextFloat();
       float eraserCost = input.nextFloat();
       float Tax = 0.18f;
       float taxCost = (penCost + pencilCost + eraserCost) * Tax;
       float totalCost = penCost + pencilCost + eraserCost + taxCost;
       System.out.println(totalCost);
    }
}