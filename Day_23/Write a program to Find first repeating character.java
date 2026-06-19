import java.util.*;
class charrepeat
{
    public static void main(String[] args) 
    {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the string");
        String str=in.nextLine();
        boolean found=false;
        for(int i=0;i<str.length();i++)
        {
           for(int j=i+1; j<str.length();j++)
            {
                if(str.charAt(i)==str.charAt(j))
                {
                    System.out.println("the first repeating character is : "+str.charAt(i));
                    found=true;
                    break;
                } 
            }
        if(found)
            break;
        }
        if(!found)
            System.out.println("the string hasno repeating character");
    }
}