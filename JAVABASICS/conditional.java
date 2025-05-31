import java.util.*;
public class conditional {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the year:");
        int year = inp.nextInt();
        System.out.println(year);
        if(year % 4 == 0)
        {
            if(year % 100 == 0)
            {
                if(year % 400 == 0)
                {
                    System.out.println("Given year is leap year");
                }
                else    
                {
                    System.out.println("Given year is not a leap year");
                }
            }
            else
            {
                System.out.println("Given year is leap year");
            }
        }
        else
        {
            System.out.println("Given year is not a leap year");
        }
    }
}
