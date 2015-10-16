import java.util.Scanner;

public class LeapYear
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);

      System.out.print("Input the year that you want to check: ");
      double year = in.nextDouble();       
      
      if ((year%400==0||year%100!=0)&&(year%4==0)){
          
          System.out.println("The year is a leap year.");
        }
        else
        {
            System.out.println("The year is not a leap year");
        }
    }
}

