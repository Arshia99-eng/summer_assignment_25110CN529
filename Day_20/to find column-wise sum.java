import java.util.*;
class colsum
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the value of row and column ");
        int n=in.nextInt();
        int m=in.nextInt();
        int a[][]=new int[n][m];
        boolean flag=true;
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
            int colsum=0;
            for(int j=0; j<m;j++)
            {
               colsum+=a[j][i];
            }
            System.out.println("the sum of column "+(i+1)+" is "+colsum);
        }
    }
}
