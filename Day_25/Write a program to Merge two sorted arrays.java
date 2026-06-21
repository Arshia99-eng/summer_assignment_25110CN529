import java.util.*;
class mergearray
{
    public static void main(String[] args) 
    {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the size of 1st array");
        int n=in.nextInt();
        int a[]=new int[n];
        System.out.println("enter the elements");
        for(int i=0;i<n;i++)
        {
            a[i]=in.nextInt();
        }
        System.out.println("enter the size of 2nd array");
        int m=in.nextInt();
        int b[]=new int[m];
        System.out.println("enter the elements");
        for(int i=0;i<m;i++)
        {
            b[i]=in.nextInt();
        }
        int c[]=new int[n+m];
        int i=0,j=0,k=0;
        while(i<a.length&&j<b.length)
        {
            if(a[i]<b[j])
                c[k++]=a[i++];
            else
                c[k++]=b[j++];
        }
        while(i<a.length)
        {
            c[k++]=a[i++];
        }
        while(j<b.length)
        {
            c[k++]=b[j++];
        }
        for(int l=0;l<c.length;l++)
        {
            System.out.print(c[l]+" ");
        }
    }
}