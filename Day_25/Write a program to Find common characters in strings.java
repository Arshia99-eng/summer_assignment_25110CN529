import java.util.*;
class commonchar
{
    public static void main(String[] args) 
    {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the strings");
        String str1=in.nextLine();
        String str2=in.nextLine();
        String cm="";
        for(int i=0; i<str1.length();i++)
        {
            if(str2.indexOf(str1.charAt(i))!=-1)
                {
                    if(cm.indexOf(str1.charAt(i))==-1)
                    {
                        cm+=str1.charAt(i);
                    }
                }
        }
        System.out.println("the characters common to both the strings are : "+cm);
    }
} 