import java.util.*;

class duplicate
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

        for(int i = 0; i < n; i++)
        {
            int count = 0;
            boolean alreadyPrinted = false;

            // Check if element already processed
            for(int k = 0; k < i; k++)
            {
                if(a[i] == a[k])
                {
                    alreadyPrinted = true;
                    break;
                }
            }

            if(alreadyPrinted)
            {
                continue;
            }

            // Count duplicates
            for(int j = i + 1; j < n; j++)
            {
                if(a[i] == a[j])
                {
                    count++;
                }
            }

            if(count > 0)
            {
                System.out.println(count + " duplicates exist for " + a[i] + " in the array");
            }
        }
    }
}