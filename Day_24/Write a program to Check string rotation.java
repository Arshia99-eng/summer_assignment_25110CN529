import java.util.*;
class stringrotation
{
    public static void main(String[] args) 
    {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the first string");
        String str1=in.nextLine();
        System.out.println("enter the second string");
        String str2=in.nextLine();
        if(str1.length()==str2.length())
        {
            String temp=str1+str1;
            if(temp.contains(str2))
                System.out.println("these two strings are rotations of each other");
            else
                System.out.println("these two strings are rotations of each other");
        }
        else
            System.out.println("these are not string rotation");
    }
}