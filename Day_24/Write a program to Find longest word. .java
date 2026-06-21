import java.util.*;
class longestword
{
    public static void main(String[] args) 
    {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the string ");
        String str=in.nextLine();
        String wrd="";
        String lonwrd="";
        int count=0, maxcount=0;
        for(int i=0;i<str.length();i++)
        {
            if(!Character.isWhitespace(str.charAt(i)))
            {
                count++;
                wrd=wrd+str.charAt(i);
            }  
            else
            {
                if(maxcount<count)
                {
                    maxcount=count;
                    lonwrd=wrd;
                }
             wrd="";
             count=0;

            }
        }
        if(count > maxcount)
        {
            maxcount = count;
            lonwrd = wrd;
        }
        System.out.println("longest word in the string is : "+lonwrd);

    }
}