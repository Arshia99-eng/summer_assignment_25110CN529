import java.util.*;
class duplicateremove
{
    public static void main(String[] args) 
    {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the string");
        String str=in.nextLine();
        String nwrd="";
        for(int i=0; i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(nwrd.indexOf(ch)==-1)
                nwrd=nwrd+ch;
        }
        System.out.println("the new word after removing the duplicates is : "+nwrd);
    }
}