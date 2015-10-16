import java.util.Scanner;

/**
 * Tells you whether a number is +, -, or 0 and gives size estimate- small if<1, large if >1000000
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Epsilon
{
    /** description of instance variable x (add comment for each instance variable) */
    

    /**
     * Default constructor for objects of class Epsilon
     */
    public Epsilon()
    {
        
    }

    /**
     * An example of a method - replace this comment with your own
     *    that describes the operation of the method
     *
     * @pre        preconditions for the method
     *            (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    y    description of parameter y
     * @return    description of the return value
     */
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        final double EPSILON=1e-14; 
        System.out.print("Enter a floating-point number: ");
        double i=in.nextDouble();
        String adj="";
        if (Math.abs(i)>1000000){
            adj="very large ";}
        else if (Math.abs(i)<1){
            adj="small ";}
        if (Math.abs(i)<=EPSILON)
        {
            System.out.println("The number is 0.");
        }
        else if (i<0)
        {
            System.out.println("The number is a "+adj+"negative number.");
        }
        else
        {
            System.out.println("The number is a "+adj+"positive number.");
        }
    }

}
