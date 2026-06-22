import java.util.*;
class marksheet
{
    static Scanner in = new Scanner(System.in);
    static int n;
    static String roll[];
    static String name[];
    static double eng[], math[], sci[], sst[], comp[];
    static double total[], per[];
    static String grade[];

    static void addRecords()
    {
        for(int i=0;i<n;i++)
        {
            System.out.println("Student "+(i+1));

            System.out.print("Enter Roll Number: ");
            roll[i] = in.nextLine();

            System.out.print("Enter Name: ");
            name[i] = in.nextLine();

            System.out.print("English Marks: ");
            eng[i] = in.nextDouble();

            System.out.print("Math Marks: ");
            math[i] = in.nextDouble();

            System.out.print("Science Marks: ");
            sci[i] = in.nextDouble();

            System.out.print("SST Marks: ");
            sst[i] = in.nextDouble();

            System.out.print("Computer Marks: ");
            comp[i] = in.nextDouble();

            total[i] = eng[i] + math[i] + sci[i] + sst[i] + comp[i];
            per[i] = total[i] / 5.0;

            if(per[i] >= 90)
                grade[i] = "A+";
            else if(per[i] >= 80)
                grade[i] = "A";
            else if(per[i] >= 70)
                grade[i] = "B";
            else if(per[i] >= 60)
                grade[i] = "C";
            else if(per[i] >= 50)
                grade[i] = "D";
            else
                grade[i] = "F";

            in.nextLine();
        }
    }

    static void display()
    {
        System.out.printf("%-10s %-20s %-8s %-8s %-8s %-8s %-8s %-10s %-10s %-8s%n",
                "Roll No","Name","Eng","Math","Sci","SST","Comp","Total","Percent","Grade");

        for(int i=0;i<n;i++)
        {
            System.out.printf("%-10s %-20s %-8.0f %-8.0f %-8.0f %-8.0f %-8.0f %-10.0f %-10.2f %-8s%n",
                    roll[i],name[i],eng[i],math[i],sci[i],sst[i],comp[i],
                    total[i],per[i],grade[i]);
        }
    }

    public static void main(String[] args)
    {
        System.out.print("Enter number of students: ");
        n = in.nextInt();
        in.nextLine();

        roll = new String[n];
        name = new String[n];
        eng = new double[n];
        math = new double[n];
        sci = new double[n];
        sst = new double[n];
        comp = new double[n];
        total = new double[n];
        per = new double[n];
        grade = new String[n];

        while(true)
        {
            System.out.println("\n1. Add Records");
            System.out.println("2. Display Marksheet");
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
