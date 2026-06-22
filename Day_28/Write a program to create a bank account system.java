import java.util.*;
class banksystem
{
    static Scanner in = new Scanner(System.in);
    static int n;
    static String accno[];
    static String name[];
    static double balance[];

    static void createAccounts()
    {
        for(int i=0;i<n;i++)
        {
            System.out.println("Account " + (i+1));

            System.out.print("Enter Account Number: ");
            accno[i] = in.nextLine();

            System.out.print("Enter Account Holder Name: ");
            name[i] = in.nextLine();

            System.out.print("Enter Initial Balance: ");
            balance[i] = in.nextDouble();
            in.nextLine();
        }
    }

    static void deposit()
    {
        System.out.print("Enter Account Number: ");
        String ac = in.nextLine();

        for(int i=0;i<n;i++)
        {
            if(accno[i].equalsIgnoreCase(ac))
            {
                System.out.print("Enter Amount to Deposit: ");
                double amt = in.nextDouble();
                in.nextLine();

                balance[i] += amt;

                System.out.println("Amount Deposited Successfully");
                System.out.println("Updated Balance: " + balance[i]);
                return;
            }
        }

        System.out.println("Account Not Found");
    }

    static void withdraw()
    {
        System.out.print("Enter Account Number: ");
        String ac = in.nextLine();

        for(int i=0;i<n;i++)
        {
            if(accno[i].equalsIgnoreCase(ac))
            {
                System.out.print("Enter Amount to Withdraw: ");
                double amt = in.nextDouble();
                in.nextLine();

                if(amt <= balance[i])
                {
                    balance[i] -= amt;
                    System.out.println("Withdrawal Successful");
                    System.out.println("Remaining Balance: " + balance[i]);
                }
                else
                {
                    System.out.println("Insufficient Balance");
                }
                return;
            }
        }

        System.out.println("Account Not Found");
    }

    static void checkBalance()
    {
        System.out.print("Enter Account Number: ");
        String ac = in.nextLine();

        for(int i=0;i<n;i++)
        {
            if(accno[i].equalsIgnoreCase(ac))
            {
                System.out.println("Account Holder: " + name[i]);
                System.out.println("Balance: " + balance[i]);
                return;
            }
        }

        System.out.println("Account Not Found");
    }

    static void displayAccounts()
    {
        System.out.printf("%-15s %-25s %-15s%n",
                "Account No","Account Holder","Balance");

        for(int i=0;i<n;i++)
        {
            System.out.printf("%-15s %-25s %-15.2f%n",
                    accno[i],name[i],balance[i]);
        }
    }

    public static void main(String[] args)
    {
        System.out.print("Enter Number of Accounts: ");
        n = in.nextInt();
        in.nextLine();

        accno = new String[n];
        name = new String[n];
        balance = new double[n];

        while(true)
        {
            System.out.println("\n===== BANK ACCOUNT SYSTEM =====");
            System.out.println("1. Create Accounts");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. Display All Accounts");
            System.out.println("6. Exit");
            System.out.print("Enter Choice: ");

            int ch = in.nextInt();
            in.nextLine();

            switch(ch)
            {
                case 1:
                    createAccounts();
                    break;

                case 2:
                    deposit();
                    break;

                case 3:
                    withdraw();
                    break;

                case 4:
                    checkBalance();
                    break;

                case 5:
                    displayAccounts();
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