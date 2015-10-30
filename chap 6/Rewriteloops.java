public class Rewriteloops
{
    public static void loop()
    {
        int s=0;
        int i=1;
        while (i<=10)
        {
            s+=i;
            i++;
        }
        int n=1;
        double x=0;
        double s2;
        while (s>.01)
        {
            s2=1.0/(1+n*n);
            n++;
            x+=s2;
        }
    }
}
