import java.util.*;
class sort
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n=in.nextInt();
        int a[]=new int[n];
        System.out.println("enter the elements");
        //input of the array
        for(int i=0;i<n;i++)
        {
           a[i]=in.nextInt();
        }
        //sorting of the array in decreasing order
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                if(a[i]<a[j])
                {
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        //printing of sorted array
        for(int i=0;i<n;i++)
        {
          System.out.print(a[i]+" ");
        }
        //finding the second largest element
        System.out.println("second largest element is "+a[1]);
    }
}