import java.util.*;
class BinarySearch
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the size of the array");
        int n = in.nextInt();

        int a[] = new int[n];

        System.out.println("Enter the elements in sorted order");
        for(int i = 0; i < n; i++)
        {
            a[i] = in.nextInt();
        }

        System.out.println("Enter the element to search");
        int key = in.nextInt();

        int low = 0;
        int high = n - 1;
        int pos = -1;

        while(low <= high)
        {
            int mid = (low + high) / 2;

            if(a[mid] == key)
            {
                pos = mid;
                break;
            }
            else if(a[mid] < key)
            {
                low = mid + 1;
            }
            else
            {
                high = mid - 1;
            }
        }

        if(pos != -1)
        {
            System.out.println("Element found at index " + pos);
        }
        else
        {
            System.out.println("Element not found");
        }
    }
}