import java.util.*;
class matadd
{
   static int N,M;
   static Scanner in=new Scanner(System.in);
   static int a[][];
   static int b[][];

   static void matinput(int n, int m)
    {
        System.out.println("enter the elements of matrix");
                for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=in.nextInt();
            }
        }
        System.out.println("enter the elements of second matrix");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                b[i][j]=in.nextInt();
            }
        }
    }
    static void add(int a[][],int b[][])
    {
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<M;j++)
            {
                a[i][j]=a[i][j]+b[i][j];
            }
        }
        System.out.println("sum of matrices is : ");
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<M;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) 
    {
     System.out.println("enter the order of matrix");
     System.out.println("n: ");
     N=in.nextInt();
     System.out.println("m : ");
     M=in.nextInt();
     a=new int[N][M];
     b=new int[N][M];
     matinput(N, M);
     add(a, b);
    }
}