import java.util.*;
class frequency
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n=in.nextInt();
        int a[]=new int[n];
        int count=0;
        System.out.println("enter the elements");
        for(int i=0;i<n;i++)
        {
           a[i]=in.nextInt();
        }
        System.out.println("enter the element to find ferquency");
        int target=in.nextInt();
        for(int i=0;i<n;i++)
        {
          if(a[i]==target)
            {
               count++;
            }
        }
         System.out.println("frequency of element is "+count);
    }
}