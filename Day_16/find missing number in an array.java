import java.util.*;
class numbers
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the value of n");
        int n=in.nextInt();
        int a[]=new int[n-1];
        int elesum=0;
        int sum=0;
        //input of array and sum of elements
        System.out.println("enter the elements ");
        for(int i=0;i<n-1;i++)
        {
          a[i]=in.nextInt();
          elesum=elesum+a[i];
        }
        //sum of n numbers
        sum=n*(n+1)/2;
        int miss=Math.abs(sum-elesum);
        System.out.println("missing element is : "+miss);
    }
}