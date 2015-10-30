
import java.util.Scanner;

public class Substrings
{
    public static void substrings()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a string.");
        String str=s.next();       
        for (int counter=0; counter<str.length(); counter++)
        {
            for (int i=0; i<str.length()-counter; i++)
            {
                System.out.println(str.substring(i,i+counter+1));
            }
        }
    }
}
