import java.util.*;
class removespace
{
    public static void main(String[] args) 
    {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the string");
        String str=in.nextLine().trim();
        for(int i=0;i<str.length();i++)
        {
            if(Character.isWhitespace(str.charAt(i)))
                continue;
            else
                System.out.print(str.charAt(i));
        }
    }
}