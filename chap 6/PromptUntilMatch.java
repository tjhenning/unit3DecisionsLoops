import java.util.Scanner;

public class PromptUntilMatch
{
    public static double promptUntilMatch()
    {
        boolean valid=false;
        double input;
        Scanner scan=new Scanner( System.in);
        do
        {
            System.out.print("Please enter a value 0<x<100: ");
            input=scan.nextDouble();
        }
        while (input<0 || input > 100);
        return input;
    }
}
        
    