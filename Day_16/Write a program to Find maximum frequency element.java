import java.util.*;
class numbersferquency
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n=in.nextInt();
        System.out.println("enter the elements");
        int a[]=new int[n];
        int count=1;
        int maxf=0,maxele=0;
        for(int i=0;i<n;i++)
        {
            a[i]=in.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
              if(a[i]==a[j])
              count++;
            }
            if(maxf<count)
            {
              maxf=count;
              maxele=a[i];
            }   
           count=1;
        }
        System.out.println("the element with the maximum frequency is : "+maxele);
    }
}
