import java.util.*;
class characterpy
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the height of the pyramid");
        int h=in.nextInt();
        for(int i=1;i<=h;i++)
        {
            for(int j=65;j<h+65-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print((char)(j+64));
            }
            for(int j=i-1;j>=1;j--)
            {
                System.out.print((char)(j+64));
            }
                    System.out.println();
        }
    }
}