import java.util.Scanner;

public class Spectrum
{
     public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give a wavelength: ");
        Double wave = scan.nextDouble();
        if (wave>10e-1)
        {
            System.out.println("It is a radio wave.");
        }
        else if (wave>10e-3)
        {
            System.out.println("It is a microwave.");
        }
        else if (wave>7e-7)
        {
            System.out.println("It is an infared wave.");
        }
        else if (wave>4e-7)
        {
            System.out.println("It is visible light.");
        }
        else if (wave>10e-8)
        {
            System.out.println("It is an ultraviolet wave.");
        }
        else if (wave>10e-11)
        {
            System.out.println("It is an X-ray wave.");
        }
        else         
        {
            System.out.println("It is a gamma ray.");
        }
        //You can't make this shorter, can you?
    }
}