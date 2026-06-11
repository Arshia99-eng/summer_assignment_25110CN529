import java.util.*;
class rightshift
{ 
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n=in.nextInt();
        int[] arr=new int[n];
        int temp=0;
        System.out.println("enter the elements of the array");
        //input
        for(int i=0;i<n;i++)
        {
           arr[i]=in.nextInt();
        }
        //original array
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        temp=arr[n-1];
        //shifting the array to the left
        for(int i=n-1;i>=0;i--)
        { 
            if(i==0)
                arr[i]=temp;
            else
               arr[i]=arr[i-1];
        }
        //shifted array
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
