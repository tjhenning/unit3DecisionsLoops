import java.util.Scanner;

public class CircleOverlap
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);

      System.out.print("Input the radius of the first circle: ");
      double radius1 = in.nextDouble(); 
      double xcenter1 = 0;
      double ycenter1 = 0;
      System.out.print("Input the radius of the second circle: ");
      double radius2 = in.nextDouble(); 
      double xcenter2 = 40;
      double ycenter2 = 0;

      double distancex=Math.pow(xcenter1-xcenter2,2);
      double distancey=Math.pow(ycenter1-ycenter2,2);
      double distance=Math.sqrt(distancex+distancey);
      if (distance>(radius1+radius2)){
          System.out.println("The circles do not overlap.");
      }
      else if (distance+radius1<radius2||distance+radius2<radius1)
      {
          System.out.println("The circles are mutually contained.");
      }
      else
      {
          System.out.println("The circles overlap.");
      }
   }
}
