

import java.util.Scanner;

public class ArmstrongNums
{
   public static void main(String[] args)
   {
      //Scanner in = new Scanner(System.in);

      
      int counter=100;
      int strNum;
      int num1;
      int num2;
      int num3;
      while (1000>counter)
      {          
          strNum= counter;
          num1=counter/100;
          num2=(counter%100)/10;
          num3=counter%10;
          if (num1*num1*num1+(num2*num2*num2)+(num3*num3*num3)==counter)
          {
              System.out.println(counter);
            }
          counter++;
      }
    }
}

