import java.util.*;
class library
{
    static Scanner in = new Scanner(System.in);
    static int n;
    static String bookid[];
    static String title[];
    static String author[];
    static int quantity[];

    static void addBooks()
    {
        for(int i=0;i<n;i++)
        {
            System.out.println("Book " + (i+1));

            System.out.print("Enter Book ID: ");
            bookid[i] = in.nextLine();

            System.out.print("Enter Book Title: ");
            title[i] = in.nextLine();

            System.out.print("Enter Author Name: ");
            author[i] = in.nextLine();

            System.out.print("Enter Quantity: ");
            quantity[i] = in.nextInt();
            in.nextLine();
        }
    }

    static void issueBook()
    {
        System.out.print("Enter Book ID: ");
        String id = in.nextLine();

        for(int i=0;i<n;i++)
        {
            if(bookid[i].equalsIgnoreCase(id))
            {
                if(quantity[i] > 0)
                {
                    quantity[i]--;
                    System.out.println("Book Issued Successfully");
                }
                else
                {
                    System.out.println("Book Not Available");
                }
                return;
            }
        }

        System.out.println("Book Not Found");
    }

    static void returnBook()
    {
        System.out.print("Enter Book ID: ");
        String id = in.nextLine();

        for(int i=0;i<n;i++)
        {
            if(bookid[i].equalsIgnoreCase(id))
            {
                quantity[i]++;
                System.out.println("Book Returned Successfully");
                return;
            }
        }

        System.out.println("Book Not Found");
    }

    static void display()
    {
        System.out.printf("%-10s %-25s %-20s %-10s%n",
                "Book ID","Title","Author","Quantity");

        for(int i=0;i<n;i++)
        {
            System.out.printf("%-10s %-25s %-20s %-10d%n",
                    bookid[i],title[i],author[i],quantity[i]);
        }
    }

    public static void main(String[] args)
    {
        System.out.print("Enter Number of Books: ");
        n = in.nextInt();
        in.nextLine();

        bookid = new String[n];
        title = new String[n];
        author = new String[n];
        quantity = new int[n];

        while(true)
        {
            System.out.println("\n===== LIBRARY MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Books");
            System.out.println("2. Issue Book");
            System.out.println("3. Return Book");
            System.out.println("4. Display Books");
            System.out.println("5. Exit");
            System.out.print("Enter Choice: ");

            int ch = in.nextInt();
            in.nextLine();

            switch(ch)
            {
                case 1:
                    addBooks();
                    break;

                case 2:
                    issueBook();
                    break;

                case 3:
                    returnBook();
                    break;

                case 4:
                    display();
                    break;

                case 5:
                    System.out.println("Program Ended");
                    return;

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}