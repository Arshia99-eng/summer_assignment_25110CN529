import java.util.*;
class salarysys
{
    static Scanner in = new Scanner(System.in);
    static int n;
    static String empid[];
    static String name[];
    static double basic[];
    static double hra[];
    static double da[];
    static double gross[];

    static void addRecords()
    {
        for(int i=0;i<n;i++)
        {
            System.out.println("Employee "+(i+1));

            System.out.print("Enter Employee ID: ");
            empid[i] = in.nextLine();

            System.out.print("Enter Employee Name: ");
            name[i] = in.nextLine();

            System.out.print("Enter Basic Salary: ");
            basic[i] = in.nextDouble();

            hra[i] = basic[i] * 0.20;
            da[i] = basic[i] * 0.10;
            gross[i] = basic[i] + hra[i] + da[i];

            in.nextLine();
        }
    }

    static void display()
    {
        System.out.printf("%-10s %-20s %-12s %-12s %-12s %-12s%n",
                "Emp ID","Name","Basic","HRA","DA","Gross");

        for(int i=0;i<n;i++)
        {
            System.out.printf("%-10s %-20s %-12.2f %-12.2f %-12.2f %-12.2f%n",
                    empid[i],name[i],basic[i],hra[i],da[i],gross[i]);
        }
    }

    public static void main(String[] args)
    {
        System.out.print("Enter number of employees: ");
        n = in.nextInt();
        in.nextLine();

        empid = new String[n];
        name = new String[n];
        basic = new double[n];
        hra = new double[n];
        da = new double[n];
        gross = new double[n];

        while(true)
        {
            System.out.println("\n1. Add Records");
            System.out.println("2. Display Salary Details");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");

            int ch = in.nextInt();
            in.nextLine();

            switch(ch)
            {
                case 1:
                    addRecords();
                    break;

                case 2:
                    display();
                    break;

                case 3:
                    System.out.println("Program Ended");
                    return;

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}