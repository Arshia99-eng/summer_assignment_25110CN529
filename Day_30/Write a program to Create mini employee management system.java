import java.util.*;
class empsys
{
    static Scanner in=new Scanner(System.in);
    static int emp;
    static String empid[];
    static String empname[];
    static String dob[];
    static String mbno[];
    static String emercon[];
    static String emerno[];
    static String deprt[];
    static String des[];
    static double basic[];
    static String pmtd[];
    static String univ[];
    static String lang[];

    public static void personal_details()
    {
        for(int i=0;i<emp;i++)
            {
                System.out.println("Employee "+(i+1)+" :");
                System.out.println("Enter employee ID : ");
                empid[i]=in.nextLine();
                System.out.println();

                System.out.println("Enter employee name : ");
                empname[i]=in.nextLine();
                System.out.println();
                
                System.out.println("Enter employee DOB : ");
                dob[i]=in.nextLine();
                System.out.println();
            }
        return;
    }
    public static void contact_details()
    {
     for(int i=0;i<emp;i++)
            {
                System.out.println("Employee "+(i+1)+" :");
                System.out.println("Enter employee mobile number: ");
                mbno[i]=in.nextLine();
                System.out.println();

                System.out.println("Enter employee emergency contact name : ");
                emercon[i]=in.nextLine();
                System.out.println();
              
                System.out.println("Enter employee emergency contact number : ");
                emerno[i]=in.nextLine();
                System.out.println();
            }
         return;
        
    }
    public static void job_details()
    {
        for(int i=0;i<emp;i++)
            {
                System.out.println("Employee "+(i+1)+" :");
                System.out.println("Enter employee department: ");
                deprt[i]=in.nextLine();
                System.out.println();
               
                System.out.println("Enter employee designation: ");
                des[i]=in.nextLine();
                System.out.println();
                
            }
       return;
    }
    public static void salary_details()
    {
        for(int i=0;i<emp;i++)
        {
          System.out.println("Employee "+(i+1)+" :");
          System.out.println("Enter employee basic salary: ");
          basic[i]=in.nextDouble();
          in.nextLine();
          System.out.println();
          
          System.out.println("Enter payment method: ");
          pmtd[i]=in.nextLine();
          System.out.println();
        }
        return;
    }
    public static void skills_details()
    {
        for(int i=0;i<emp;i++)
        {
          System.out.println("Employee "+(i+1)+" :");
          System.out.println("Enter University name: ");
          univ[i]=in.nextLine();
          System.out.println();
          
          System.out.println("Enter language known by employee: ");
          lang[i]=in.nextLine();
          System.out.println();
          
        }
        return;
    }
    public static void display()
    {
       System.out.printf("%-10s %-20s %-15s %-15s %-20s %-18s %-15s %-15s %-12s %-15s %-20s %-15s%n","Emp.ID","Name","DOB","Mobile No","Emergency Contact","Emergency No","Department","Designation","Salary","Payment","University","Language");
      for(int i=0;i<emp;i++)
      {
        System.out.printf("%-10s %-20s %-15s %-15s %-20s %-15s %-15s %-15s %-12.2f %-15s %-20s %-15s%n",empid[i],empname[i],dob[i],mbno[i],emercon[i],emerno[i],deprt[i],des[i],basic[i],pmtd[i],univ[i],lang[i]);
       System.out.println();
      }
    }
    public static void main(String[] args) 
    {
        System.out.println("Enter the number of employees");
        emp=in.nextInt();
        in.nextLine();

        empid=new String[emp];
          empname=new String[emp];
          dob=new String[emp];
          mbno=new String[emp];
          emercon=new String[emp];
          emerno=new String[emp];
          deprt=new String[emp];
          des=new String[emp];
          basic=new double[emp];
          pmtd=new String[emp];
          univ=new String[emp];
          lang=new String[emp];

        while(true)
        {
          
          System.out.println("Enter the key\n1.Add records\n2.Display records\n3.Exit");
          int n=in.nextInt();
          in.nextLine();
          if(n==1)
          {
            System.out.println("Enter the key\n1.Personal details\n2.Contact details\n3.job details\n4.salary details\n5.Skills details");
            int key=in.nextInt();
            in.nextLine();
            switch (key) 
            {
                case 1:
                    {
                    
                    personal_details();
                    break;
                    }
                case 2:
                    {
                     
                    contact_details();
                    break;
                    }
                case 3:
                    {
                    
                    job_details();
                    break;
                    }
                case 4:
                    {
                    
                    salary_details();
                    break;
                    }
                case 5:
                    {
                    
                    skills_details();
                    break;
                    }
                default :
                    System.out.println("INVALID KEY");
                }
                System.out.println("Do you want to continue ? yes or no");
                String ans=in.nextLine();
                if(ans.equalsIgnoreCase("yes"))
                    continue;
                else
                    break;
            }
            else if(n==2)
                display();
            else if(n==3)
               {
                 System.out.println("program ended");
                 break;
               }
        }
    }
}
