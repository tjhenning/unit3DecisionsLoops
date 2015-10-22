
import java.util.Random;

 /**
 This program computes an estimate of pi by simulating dart throws onto a square.
 */
 public class MonteCarlo
 {
 public static void main(String[] args)
 {
 final double TRIES = 10000;
 Random generator = new Random();

 double hits = 0;
 for (int i = 1; i <= TRIES; i++)
 {
 // Generate two random numbers between –1 and 1

 double x = generator.nextDouble();
 //double x = r+1); // Between 0 and 1
 double y = generator.nextDouble();
 //double y = .5*(r+1);
//System.out.println(x);

 // Check whether the point lies in the unit circle

    if (x * x + y * y <= 1) { 
        hits++; 
    }   
 }

 /*
29 The ratio hits / tries is approximately the same as the ratio
30 circle area / square area = pi / 4
31 */

 double piEstimate = 4.0*hits / TRIES;
 System.out.println("Estimate for pi: " + piEstimate);
 }
 }