import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        // int num = 44545;
        // String temp = "";
        // for(int i=1;num>0;i++)
        // {
        //     temp = temp + (num % 10);
        //     num = num / 10;
        // }
        // num = Integer.parseInt(temp);
        // System.out.println(num);
        
        // while (num > 0) {
        //     temp = temp + (num % 10);
        //     num = num / 10;
        // }
        // num = Integer.parseInt(temp);
        // System. out.println(num);
//     Scanner sc = new Scanner(System.in);
//     for(int i = 1;i>=0;i++)
//     {
//         System.out.println("Please enter the input");
//         int value = sc.nextInt();
//         if(value % 10 == 0)
//         {
//             System.out.println("The value inputted is a multiple of 10"+" => "+value);
//             break;
//         }
//         else
//         {
//             System.out.println("The inputted value is not a multiple of 10"+" => "+value);
//         }
//     } 

    //    int i = 1;
    //    for(i=1;i<=10;i++)
    //    {
    //     if(i== 3)
    //     {
    //         System.out.println("Skipped 3rd iteration");
    //         continue;
    //     }
    //     System.out.println("Hello world");
    //    }
       Scanner sc = new Scanner(System.in);
    for(int i = 1;i>=0;i++)
    {
        System.out.println("Please enter the input");
        int value = sc.nextInt();
        if(value % 10 == 0)
        {
            System.out.println("The value inputted is a multiple of 10 I am not printinng you");
            continue;
        }
        else
        {
            System.out.println("The inputted value is not a multiple of 10 I am printing you"+" => "+value);
        }
    } 
  }
}
