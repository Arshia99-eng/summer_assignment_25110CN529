import java.util.*;
class pyramid
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the height of the pyramid");
        int h=in.nextInt();
        for(int i=h-1;i>=0;i--) // h=5  i=4 to 0
        {
            for(int j=1;j<=h+i;j++) // j=1 to 9,8,7,6,5
            {
                if((i+j)>=h) // 
                    System.out.print("*");
                else
                    System.out.print(".");
            }
            System.out.println();
        }

    }
}