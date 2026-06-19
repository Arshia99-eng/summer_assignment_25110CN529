import java.util.*;
class maxfreq
{
    public static void main(String[] args) 
    {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the string");
        String str=in.nextLine();
        int maxfreq=0;
        char maxfreqchar=' ';
        for(int i=0; i<str.length();i++)
        {
            int freq=0;
            for(int j=0; j<str.length();j++)
            {
                if(str.charAt(i)==str.charAt(j))
                    freq++;
            }
            if(freq>maxfreq)
            {
              maxfreq=freq;
              maxfreqchar=str.charAt(i);
            }
        }
        System.out.println("the maximum frequent character is : "+maxfreqchar);
    }
}