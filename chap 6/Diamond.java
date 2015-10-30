
import java.util.Scanner;

public class Diamond
{
    public static void diamond()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number.");
        int width=s.nextInt();       
        for (int counter=0; counter<width; counter++)
        {
            for (int counter2=width-counter; counter2>0; counter2--)
            {
               System.out.print(" ");
            }
            System.out.print("*");
            for (int counter2=0; counter2<counter; counter2++)
            {
               System.out.print("**");
            }            
            System.out.println();
        }
        for (int counter=width; counter>=0; counter--)
        {
            for (int counter2=width-counter; counter2>0; counter2--)
            {
               System.out.print(" ");
            }
            System.out.print("*");
            for (int counter2=0; counter2<counter; counter2++)
            {
               System.out.print("**");
            }            
            System.out.println();
        }        
    }
}
//█