import java.util.*;
class StudentRecord
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = in.nextInt();
        int roll[] = new int[n];
        String name[] = new String[n];
        double marks[] = new double[n];
        while(true)
        {
            System.out.println("\n1. Add Records");
            System.out.println("2. Display Records");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            int ch = in.nextInt();
            switch(ch)
            {
                case 1:
                    for(int i=0;i<n;i++)
                    {
                        System.out.println("\nStudent "+(i+1));
                        System.out.print("Enter Roll No: ");
                        roll[i] = in.nextInt();
                        in.nextLine();
                        System.out.print("Enter Name: ");
                        name[i] = in.nextLine();
                        System.out.print("Enter Marks: ");
                        marks[i] = in.nextDouble();
                    }
                    break;
                case 2:
                    System.out.println("\nRoll\tName\tMarks");
                    for(int i=0;i<n;i++)
                    {
                        System.out.println(roll[i]+"\t"+name[i]+"\t"+marks[i]);
                    }
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