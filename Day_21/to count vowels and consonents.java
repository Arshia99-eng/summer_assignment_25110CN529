import java.util.*;
class vowelcount
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the string");
        String str=in.nextLine();
        str=str.toUpperCase();
        int n=str.length();
        int vcount=0;
        int ccount=0;
        for(int i=0;i<n;i++)
        {
            if(Character.isLetter(str.charAt(i)))
            {
            if(str.charAt(i)=='U'||str.charAt(i)=='O'||str.charAt(i)=='I'||str.charAt(i)=='E'||str.charAt(i)=='A')
                vcount++;
            else
                ccount++;
            }
        }
        System.out.println("the number of vowels in the string is : "+vcount);
        System.out.println("the number of consonents in the string is : "+ccount);
    }
}