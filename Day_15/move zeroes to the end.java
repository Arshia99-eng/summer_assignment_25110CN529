import java.util.*;
class movezero
{ 
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n=in.nextInt();
        int[] arr=new int[n];
        int count=0;
        System.out.println("enter the elements of the array");
        //input
        for(int i=0;i<n;i++)
        {
           arr[i]=in.nextInt();
           if(arr[i]==0)
            count++;
        }
        //printing
        for(int i=0;i<n;i++)
        {
            if(arr[i]==0)
              continue;
            else  
             System.out.print(arr[i]+" ");
        }
        for(int i=1;i<=count;i++)
        {
            System.out.print("0 ");
        }
    }
}
