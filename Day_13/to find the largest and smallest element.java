import java.util.*;
class maxmin
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
        int max=arr[0];
        int min=arr[0];
        for(int i=0;i<n;i++)
        {
           if(max<arr[i])
            max=arr[i];
           if(min>arr[i])
            min=arr[i];
        }
        System.out.println("the maximum element in the array : "+max);
        System.out.println("the minimum element in the array : "+min);
    }
}
