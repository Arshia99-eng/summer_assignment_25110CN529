import java.util.*;
class ticketbooking
{
    static Scanner in = new Scanner(System.in);
    static int n;
    static String ticketid[];
    static String name[];
    static String destination[];
    static int seats[];

    static void bookTickets()
    {
        for(int i=0;i<n;i++)
        {
            System.out.println("Passenger " + (i+1));

            System.out.print("Enter Ticket ID: ");
            ticketid[i] = in.nextLine();

            System.out.print("Enter Passenger Name: ");
            name[i] = in.nextLine();

            System.out.print("Enter Destination: ");
            destination[i] = in.nextLine();

            System.out.print("Enter Number of Seats: ");
            seats[i] = in.nextInt();
            in.nextLine();
        }
    }

    static void searchTicket()
    {
        System.out.print("Enter Ticket ID: ");
        String id = in.nextLine();

        for(int i=0;i<n;i++)
        {
            if(ticketid[i].equalsIgnoreCase(id))
            {
                System.out.println("Passenger Name : " + name[i]);
                System.out.println("Destination    : " + destination[i]);
                System.out.println("Seats Booked   : " + seats[i]);
                return;
            }
        }

        System.out.println("Ticket Not Found");
    }

    static void cancelTicket()
    {
        System.out.print("Enter Ticket ID: ");
        String id = in.nextLine();

        for(int i=0;i<n;i++)
        {
            if(ticketid[i].equalsIgnoreCase(id))
            {
                ticketid[i] = "";
                name[i] = "";
                destination[i] = "";
                seats[i] = 0;

                System.out.println("Ticket Cancelled Successfully");
                return;
            }
        }

        System.out.println("Ticket Not Found");
    }

    static void displayTickets()
    {
        System.out.printf("%-15s %-25s %-20s %-10s%n",
                "Ticket ID","Passenger Name","Destination","Seats");

        for(int i=0;i<n;i++)
        {
            if(!ticketid[i].equals(""))
            {
                System.out.printf("%-15s %-25s %-20s %-10d%n",
                        ticketid[i],name[i],destination[i],seats[i]);
            }
        }
    }

    public static void main(String[] args)
    {
        System.out.print("Enter Number of Tickets: ");
        n = in.nextInt();
        in.nextLine();

        ticketid = new String[n];
        name = new String[n];
        destination = new String[n];
        seats = new int[n];

        for(int i=0;i<n;i++)
            ticketid[i] = "";

        while(true)
        {
            System.out.println("\n===== TICKET BOOKING SYSTEM =====");
            System.out.println("1. Book Tickets");
            System.out.println("2. Search Ticket");
            System.out.println("3. Cancel Ticket");
            System.out.println("4. Display Tickets");
            System.out.println("5. Exit");
            System.out.print("Enter Choice: ");

            int ch = in.nextInt();
            in.nextLine();

            switch(ch)
            {
                case 1:
                    bookTickets();
                    break;

                case 2:
                    searchTicket();
                    break;

                case 3:
                    cancelTicket();
                    break;

                case 4:
                    displayTickets();
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