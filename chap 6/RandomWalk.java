
import java.util.Scanner;
import java.util.Random;

public class RandomWalk
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      Random rand=new Random();
      System.out.print("How many intersections?: ");
      long num = in.nextLong();       
      int counter=0;
      int x=0;
      int y=0;
      while (counter!=num){
        switch (rand.nextInt(4)){
            case 0:
                x++;
                break;
            case 1:
                x--;
                break;
            case 2:
                y++;
                break;
            case 3:
                y--;
                break;
            default:
                System.out.println("crud");
        }
        counter++;
        }
      System.out.println("The X value is "+x+" and the Y value is "+y+".");
    }
}

