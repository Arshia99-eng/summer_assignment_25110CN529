import java.util.*;
class contactmanagement
{
    static Scanner in = new Scanner(System.in);
    static int n;
    static String name[];
    static String mobile[];
    static String email[];

    static void addContacts()
    {
        for(int i=0;i<n;i++)
        {
            System.out.println("Contact " + (i+1));

            System.out.print("Enter Name: ");
            name[i] = in.nextLine();

            System.out.print("Enter Mobile Number: ");
            mobile[i] = in.nextLine();

            System.out.print("Enter Email ID: ");
            email[i] = in.nextLine();
        }
    }

    static void searchContact()
    {
        System.out.print("Enter Name to Search: ");
        String sname = in.nextLine();

        for(int i=0;i<n;i++)
        {
            if(name[i].equalsIgnoreCase(sname))
            {
                System.out.println("Name   : " + name[i]);
                System.out.println("Mobile : " + mobile[i]);
                System.out.println("Email  : " + email[i]);
                return;
            }
        }

        System.out.println("Contact Not Found");
    }

    static void deleteContact()
    {
        System.out.print("Enter Name to Delete: ");
        String sname = in.nextLine();

        for(int i=0;i<n;i++)
        {
            if(name[i].equalsIgnoreCase(sname))
            {
                name[i] = "";
                mobile[i] = "";
                email[i] = "";

                System.out.println("Contact Deleted Successfully");
                return;
            }
        }

        System.out.println("Contact Not Found");
    }

    static void displayContacts()
    {
        System.out.printf("%-20s %-15s %-30s%n",
                "Name", "Mobile Number", "Email ID");

        for(int i=0;i<n;i++)
        {
            if(!name[i].equals(""))
            {
                System.out.printf("%-20s %-15s %-30s%n",
                        name[i], mobile[i], email[i]);
            }
        }
    }

    public static void main(String[] args)
    {
        System.out.print("Enter Number of Contacts: ");
        n = in.nextInt();
        in.nextLine();

        name = new String[n];
        mobile = new String[n];
        email = new String[n];

        for(int i=0;i<n;i++)
            name[i] = "";

        while(true)
        {
            System.out.println("\n===== CONTACT MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Contacts");
            System.out.println("2. Search Contact");
            System.out.println("3. Delete Contact");
            System.out.println("4. Display Contacts");
            System.out.println("5. Exit");
            System.out.print("Enter Choice: ");

            int ch = in.nextInt();
            in.nextLine();

            switch(ch)
            {
                case 1:
                    addContacts();
                    break;

                case 2:
                    searchContact();
                    break;

                case 3:
                    deleteContact();
                    break;

                case 4:
                    displayContacts();
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