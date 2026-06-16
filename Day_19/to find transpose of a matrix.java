import java.util.*;
class mattranspose
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the value of row and columns ");
        int n=in.nextInt();
        int m=in.nextInt();
        int a[][]=new int[n][m];
        int b[][]=new int[m][n];
        System.out.println("enter the elements of matrix");
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m;j++)
            {
                a[i][j]=in.nextInt();
            }
        }
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m;j++)
            {
                b[j][i]=a[i][j];
            }
        }
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n;j++)
            {
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }

    }
}
