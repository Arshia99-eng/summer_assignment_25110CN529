import java.util.*;
class search
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n=in.nextInt();
        int a[]=new int[n];
        boolean found=false;
        System.out.println("enter the elements");
        for(int i=0;i<n;i++)
        {
           a[i]=in.nextInt();
        }
        System.out.println("enter the element to find");
        int target=in.nextInt();
        for(int i=0;i<n;i++)
        {
          if(a[i]==target)
            {
                found=true;
                System.out.println("element found at "+(i+1)+"th position");
                break;
            }
        }
        if(found==false)
            System.out.println("element not found");
    }
}