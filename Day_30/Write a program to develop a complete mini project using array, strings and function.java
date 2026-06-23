import java.util.*;
class StudentManagement
{
    static Scanner in = new Scanner(System.in);
    static int n;
    static String roll[];
    static String name[];
    static double marks[];
    static void addRecords()
    {
        for(int i=0;i<n;i++)
        {
            System.out.println("Student " + (i+1));

            System.out.print("Enter Roll Number: ");
            roll[i] = in.nextLine();

            System.out.print("Enter Name: ");
            name[i] = in.nextLine();

            System.out.print("Enter Marks: ");
            marks[i] = in.nextDouble();
            in.nextLine();
        }
    }
    static void searchStudent()
    {
        System.out.print("Enter Roll Number: ");
        String r = in.nextLine();

        for(int i=0;i<n;i++)
        {
            if(roll[i].equalsIgnoreCase(r))
            {
                System.out.println("Roll No : " + roll[i]);
                System.out.println("Name    : " + name[i]);
                System.out.println("Marks   : " + marks[i]);
                return;
            }
        }
        System.out.println("Student Not Found");
    }
    static void updateMarks()
    {
        System.out.print("Enter Roll Number: ");
        String r = in.nextLine();
        for(int i=0;i<n;i++)
        {
            if(roll[i].equalsIgnoreCase(r))
            {
                System.out.print("Enter New Marks: ");
                marks[i] = in.nextDouble();
                in.nextLine();

                System.out.println("Marks Updated Successfully");
                return;
            }
        }
        System.out.println("Student Not Found");
    }
    static void displayRecords()
    {
        System.out.printf("%-15s %-25s %-10s%n",
                "Roll No","Name","Marks");

        for(int i=0;i<n;i++)
        {
            System.out.printf("%-15s %-25s %-10.2f%n",
                    roll[i],name[i],marks[i]);
        }
    }
    static void topper()
    {
        int pos = 0;

        for(int i=1;i<n;i++)
        {
            if(marks[i] > marks[pos])
                pos = i;
        }
        System.out.println("Topper Details");
        System.out.println("Roll No : " + roll[pos]);
        System.out.println("Name    : " + name[pos]);
        System.out.println("Marks   : " + marks[pos]);
    }
    public static void main(String[] args)
    {
        System.out.print("Enter Number of Students: ");
        n = in.nextInt();
        in.nextLine();
        roll = new String[n];
        name = new String[n];
        marks = new double[n];
        while(true)
        {
            System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Records");
            System.out.println("2. Search Student");
            System.out.println("3. Update Marks");
            System.out.println("4. Display Records");
            System.out.println("5. Show Topper");
            System.out.println("6. Exit");
            System.out.print("Enter Choice: ");
            int ch = in.nextInt();
            in.nextLine();
            switch(ch)
            {
                case 1:
                    addRecords();
                    break;

                case 2:
                    searchStudent();
                    break;

                case 3:
                    updateMarks();
                    break;

                case 4:
                    displayRecords();
                    break;

                case 5:
                    topper();
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