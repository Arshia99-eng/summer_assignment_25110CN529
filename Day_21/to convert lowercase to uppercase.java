import java.util.*;
class lowertoupper
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the string");
        String str=in.nextLine();
        int n=str.length();
        String nstr="";
        for(int i=0;i<n;i++)
        {
            int ascii=str.charAt(i)-32;
            nstr=nstr+(char)ascii;
        }
        System.out.println("converted string : "+nstr);
    }
}
