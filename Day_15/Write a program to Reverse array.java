import java.util.*;
class reverse
{ 
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n=in.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the elements of the array");
        //input
        for(int i=0;i<n;i++)
        {
           arr[i]=in.nextInt();
        }
        //printing
        for(int i=n-1;i>=0;i--)
        {
           System.out.print(arr[i]+" ");
        }
    }
}
