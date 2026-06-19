import java.util.*;
class anagram
{
    public static void main(String[] args) 
    {
        Scanner in=new Scanner(System.in);
        System.out.println("enter string 1");
        String str1=in.nextLine();
        System.out.println("enter string 2");
        String str2=in.nextLine();
        boolean flag=false;
        if(str1.length()==str2.length())
        {
            for(int i=0; i<str1.length();i++)
            {
                int count1=0;
                int count2=0;
                for(int j=0;j<str1.length();j++)
                {
                    if(str1.charAt(i)==str1.charAt(j))
                    count1++;
                }
                for(int j=0;j<str2.length();j++)
                {
                    if(str1.charAt(i)==str2.charAt(j))
                        count2++;
                }
                if(count1!=count2)
                {
                    System.out.println("these are not anagrams");
                    flag=false;
                    break;
                }
                else
                    flag=true;
            }
            if(flag)
                System.out.println("these two are anagrams");
        }
        else
            System.out.println("these are not anagrams");
    }
}