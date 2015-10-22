import java.util.Scanner;

public class FibonacciSequence
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);

      System.out.print("Which number in the sequence do you want to see?: ");
      int num = in.nextInt();       
      int counter=0;
      int fold1 = 0;
      int fold2 = 1;
      while (num!=counter)
      {          
          fold1 = fold1 + fold2;
          fold2=fold1-fold2;
          counter++;
      }
      System.out.println(fold1);
    }
}

