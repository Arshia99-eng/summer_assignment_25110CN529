import java.util.*;
class arraysum
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n=in.nextInt();
        int arr[]=new int[n];
        int sum=0;
        System.out.println("enter the elements");
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
            sum=sum+arr[i];
        }
        int avg=sum/n;
        System.out.println("the sum of the array is : "+sum);
        System.out.println("the average of the array is : "+avg);
    }
}