import java.util.*;
class diagonalsum
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the size of the matrix ");
        int n=in.nextInt();
        int a[][]=new int[n][n];
        int sum=0;
        System.out.println("enter the elements of matrix");
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n;j++)
            {
                a[i][j]=in.nextInt();
            }
        }
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n;j++)
            {
                if(i==j)
                 sum+=a[i][j];
            }
        }
        System.out.println("the sum of the diagonal of the matrix is : "+sum);

    }
}
