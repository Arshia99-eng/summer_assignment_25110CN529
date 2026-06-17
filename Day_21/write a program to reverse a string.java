import java.util.*;
class stringrev
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
        System.out.println("reversed string is : "+rev);
    }
}