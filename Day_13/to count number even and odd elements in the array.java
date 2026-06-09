import java.util.*;
class count
{ 
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n=in.nextInt();
        int[] arr=new int[n];
        int evcount=0;
        int odcount=0;
        System.out.println("enter the elements of the array");
        //input
        for(int i=0;i<n;i++)
        {
           arr[i]=in.nextInt();
        }
        for(int i=0;i<n;i++)
        {
           if(arr[i]%2==0)
            evcount++;
           else
            odcount++;
        }
        System.out.println("number of even elements is : "+evcount);
        System.out.println("number of odd elements is : "+odcount);
    }
}
