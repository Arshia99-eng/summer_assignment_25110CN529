import java.util.*;
class hollowsquare
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the width of the square");
        int w=in.nextInt();
        for(int i=1;i<=w;i++)
        {
            for(int j=1;j<=w;j++)
            {
               if(i==1||i==w||j==1||j==w)
                System.out.print("*");
               else
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}