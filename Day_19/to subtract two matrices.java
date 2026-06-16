import java.util.*;
class matsub
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the value of row and columns ");
        int n=in.nextInt();
        int m=in.nextInt();
        int a[][]=new int[n][m];
        int b[][]=new int[n][m];
        System.out.println("enter the elements of first matrix");
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m;j++)
            {
                a[i][j]=in.nextInt();
            }
        }
        System.out.println("enter the elements of second matrix");
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m;j++)
            {
                b[i][j]=in.nextInt();
            }
        }
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m;j++)
            {
                a[i][j]=a[i][j]-b[i][j];
            }
        }
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m;j++)
            {
                System.out.print(a[i][j]+"  ");
            }
            System.out.println();
        }

    }
}