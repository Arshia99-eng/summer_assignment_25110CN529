import java.util.*;
class pairsum
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n=in.nextInt();
        System.out.println("enter the elements");
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=in.nextInt();
        }
        System.out.println("enter the target sum");
        int target=in.nextInt();
        System.out.println("following are the pairs : ");
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
              if(a[i]+a[j]==target)
                System.out.println(a[i]+" and "+a[j]);
            }
            
        }
    }
}
