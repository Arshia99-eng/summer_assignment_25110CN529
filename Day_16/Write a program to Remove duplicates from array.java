import java.util.*;

class numbersdelete
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the size of the array");
        int n = in.nextInt();

        int a[] = new int[n];

        System.out.println("Enter the elements");
        for(int i = 0; i < n; i++)
        {
            a[i] = in.nextInt();
        }

        System.out.println("Array after removing duplicates:");

        for(int i = 0; i < n; i++)
        {
            boolean duplicate = false;

            for(int j = 0; j < i; j++)
            {
                if(a[i] == a[j])
                {
                    duplicate = true;
                    break;
                }
            }

            if(!duplicate)
            {
                System.out.print(a[i] + " ");
            }
        }
    }
}