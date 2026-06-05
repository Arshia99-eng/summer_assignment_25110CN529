import java.util.*;
class pattern
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the height of the pattern");
        int h=in.nextInt();
        for(int i=0;i<h;i++)
        {
            for(int j=h;j>i;j--)
            {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}