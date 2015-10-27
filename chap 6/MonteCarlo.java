
import java.util.Random;

 /**
 This program computes an estimate of pi by simulating dart throws onto a square.
 */
 public class MonteCarlo
 {
 public static void main(String[] args)
 {
     final double TRIES = 10000;
     double hits;
     double total=0;
     for (int i=0; i<10; i++)
        {
        Random generator = new Random();
        
        hits = 0;
        for (int i2 = 1; i2 <= TRIES; i2++)
        {
            // Generate two random numbers between –1 and 1
            
            double x = generator.nextDouble();
            // Between 0 and 1
            double y = generator.nextDouble();
            
            if (x * x + y * y <= 1) { 
                hits++; 
            }   
        }

        double piEstimate = 4.0*hits / TRIES;
        System.out.println("Estimate for pi: " + piEstimate);
        total+=piEstimate;
     }
     System.out.println("Final estimate for pi: " + total/10);
     
 }
 }