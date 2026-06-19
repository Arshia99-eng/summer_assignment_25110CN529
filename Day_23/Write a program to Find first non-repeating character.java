import java.util.*;
class nocharrepeat
{
    public static void main(String[] args) 
    {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the string");
        String str=in.nextLine();
        boolean found=false;
        for(int i=0;i<str.length();i++)
        {
            int count=0;
           for(int j=0; j<str.length();j++)
            {
                if(str.charAt(i)==str.charAt(j))
                {
                    count++;
                }
            }
            if(count==1)
            {
             System.out.println("The first non-repeating character is : " + str.charAt(i));
             found = true;
             break;
            }
        }
        if(!found)
            System.out.println("the string has no non-repeating character");            
    }
}