import java.util.*;

class NumberPyramid
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter height: ");
        int h = in.nextInt();

        for(int i = 1; i <= h; i++)
        {
            // spaces
            for(int j = 1; j <= h - i; j++)
                System.out.print(" ");

            // increasing numbers
            for(int j = 1; j <= i; j++)
                System.out.print(j);

            // decreasing numbers
            for(int j = i - 1; j >= 1; j--)
                System.out.print(j);

            System.out.println();
        }
    }
}