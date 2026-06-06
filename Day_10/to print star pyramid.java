import java.util.*;
class pyramid
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the height of the pyramid");
        int h=in.nextInt();
        for(int i=0;i<h;i++)
        {
            for(int j=1;j<=h+i;j++)
            {
                if((i+j)>=5)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

    }
}