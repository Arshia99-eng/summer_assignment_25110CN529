import java.util.*;
class charfreq
{
    public static void main(String[] args) 
    {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the string");
        String str=in.nextLine();
        System.out.println("enter the character to find the frequency");
        char ch=in.next().charAt(0);
        int count=0;
        for(int i=0; i<str.length();i++)
        {
            if(str.charAt(i)==ch)
            count++;
        }
        System.out.println("the frequency of the character is "+count);
    }
}