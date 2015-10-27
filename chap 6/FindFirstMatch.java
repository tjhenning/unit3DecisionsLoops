public class FindFirstMatch
{
    public static int findFirstSpace( String str )
    {
        boolean found=false;
        int position =0;
        while( !found && position < str.length())
        {
            char ch=str.charAt( position );
            if (ch==' ')
            {
                found=true;
            }
            position++;
        }
        
        if (found)
        {
            return position;
        }
        else
        {
            return -1;
        }
    }
}