import java.util.Random;

public class MontyHall
{
    public static void montyHall()
    {
        Random r=new Random();
        int normalWins=0;
        int rightDoor;
        int choice;
        int techniqueWins=0;
        for (int i=0; i<1000; i++)
        {
            rightDoor=r.nextInt(3);
            choice=r.nextInt(3);
            if (rightDoor==choice)
            {
                normalWins++;
            }
        }
        for (int i=0; i<1000; i++)
        {
            rightDoor=r.nextInt(3);
            choice=r.nextInt(3);
            
            if (rightDoor!=choice)
            {
                techniqueWins++;
            }
        }
        System.out.println("Normal wins: "+normalWins+"\n Technique Wins: "+techniqueWins);
    }
}
