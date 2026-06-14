import java.util.*;
class merge
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the size of array 1st ");
        int n1=in.nextInt();
        int a[]=new int[n1];
        System.out.println("enter the elements");
        for(int i=0;i<n1;i++)
        {
         a[i]=in.nextInt();
        }
        System.out.println("enter the size of array 2nd ");
        int n2=in.nextInt();
        int b[]=new int[n2];
        System.out.println("enter the elements");
        for(int i=0;i<n2;i++)
        {
         b[i]=in.nextInt();
        }
        int c[]=new int[n1+n2];
        System.arraycopy(a,0,c,0,a.length);
        System.arraycopy(b,0,c,a.length,b.length);
        System.out.println(Arrays.toString(c));
    }
}