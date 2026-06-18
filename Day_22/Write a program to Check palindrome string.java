import java.util.*;
class stringpalin
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the string");
        String str=in.nextLine();
        int n=str.length();
        String rev="";
        for(int i=n-1;i>=0;i--)
        {
            rev=rev+str.charAt(i);
        }
        if(str.equalsIgnoreCase(rev))
            System.out.println("the string is a palindrome string");
        else
            System.out.println("the string is not a palindrome string");

    }
}