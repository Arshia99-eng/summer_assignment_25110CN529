import java.util.*;
class arrayoperations
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = in.nextInt();
        int a[] = new int[n];
        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++)
            a[i] = in.nextInt();
        while(true)
        {
            System.out.println("\n===== ARRAY OPERATIONS =====");
            System.out.println("1. Display Array");
            System.out.println("2. Sum of Elements");
            System.out.println("3. Largest Element");
            System.out.println("4. Smallest Element");
            System.out.println("5. Search Element");
            System.out.println("6. Exit");
            System.out.print("Enter Choice: ");
            int ch = in.nextInt();
            switch(ch)
            {
                case 1:
                    System.out.println("Array Elements:");
                    for(int i=0;i<n;i++)
                        System.out.print(a[i] + " ");
                    System.out.println();
                    break;

                case 2:
                    int sum = 0;
                    for(int i=0;i<n;i++)
                        sum += a[i];

                    System.out.println("Sum = " + sum);
                    break;

                case 3:
                    int max = a[0];
                    for(int i=1;i<n;i++)
                    {
                        if(a[i] > max)
                            max = a[i];
                    }

                    System.out.println("Largest Element = " + max);
                    break;

                case 4:
                    int min = a[0];
                    for(int i=1;i<n;i++)
                    {
                        if(a[i] < min)
                            min = a[i];
                    }

                    System.out.println("Smallest Element = " + min);
                    break;

                case 5:
                    System.out.print("Enter element to search: ");
                    int key = in.nextInt();

                    boolean found = false;

                    for(int i=0;i<n;i++)
                    {
                        if(a[i] == key)
                        {
                            System.out.println("Element found at index " + i);
                            found = true;
                            break;
                        }
                    }
                    if(!found)
                        System.out.println("Element not found");
                    break;

                case 6:
                    System.out.println("Program Ended");
                    return;

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}