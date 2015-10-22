
import java.util.Scanner;

public class Factors
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);

      System.out.print("Which number do you want to see the factors for?: ");
      long num = in.nextLong();       
      int counter=2;
      while (num>counter)
      {          
          if (num%counter==0){
              System.out.println(counter);
            }          
          counter++;
      }
      System.out.println(counter);
    }
}

