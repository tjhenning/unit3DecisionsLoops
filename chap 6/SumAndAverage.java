

import java.util.Scanner;

public class SumAndAverage
{
   public static double averageOfInputs()
   {
      Scanner scan = new Scanner(System.in);

      System.out.print("Enter a series of numbers. Type a letter to quit: ");
      double total=0;
      int counter=0;
      while (scan.hasNextDouble())
      {          
          double number=scan.nextDouble();
          total+=number;
          counter++;
      }
      return total/counter;
    }
}

