import java.util.*;
class symmetric
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the size of the matrix ");
        int n=in.nextInt();
        int a[][]=new int[n][n];
        boolean flag=true;
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
                if(a[i][j]!=a[j][i])
                 flag=false;
            }
        }
        if(flag==false)
        System.out.println("the matrix is not symmetric ");
        else
        System.out.println("the matrix is symmetric ");        

    }
}
