
import java.util.Scanner;

public class Primes
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);

      System.out.print("Which number do you want to see the primes up to?: ");
      long num = in.nextLong();       
      int counter=2;
      int primes=0;
      while (num!=counter)
      {          
          int counter2=2;
          primes=0;
          while (counter>counter2)
          {          
              if (counter%counter2==0){
                  primes++;
                }          
                counter2++;
            }
           // System.out.println(primes);
          if (primes==0){
              System.out.println(counter);
            }          
          counter++;
      }
      
    }
}

