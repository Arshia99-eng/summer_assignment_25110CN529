import java.util.*;
class atm
{
    static Scanner in=new Scanner(System.in);
    static double bal=5000;
    public static void startatm()
    {
        while(true)
        {
        double amt;
            System.out.println("enter the key");
            System.out.println("1. Check balance\n2. Deposit money\n3. Withdraw Money\n4. Exit");
            int key=in.nextInt();
            switch(key)
            {
                case 1:
                    {
                        System.out.println("Current balance in the account is : Rs."+bal);
                        break;
                    }
                case 2:
                    {
                        System.out.println("Enter amount to deposit");
                        amt=in.nextDouble();
                        System.out.println("current balance after deposit is : Rs."+(bal+amt));
                        bal=bal+amt;
                        break;
                    }
                case 3:
                    {
                        System.out.println("Enter amount to withdraw");
                        amt=in.nextDouble();
                        if((bal-amt)<0)
                        {
                            System.out.println("....INVALID TRANSACTION....");
                            break;
                        }
                        else
                        {
                            System.out.println("Current balance after withdrawal : Rs."+(bal-amt));
                            bal=bal-amt;
                            break;
                        }
                    }
                case 4:
                    {
                        System.out.println("Are you sure you want to exit ?\n1.Yes\n2.No");
                        int ans=in.nextInt();
                        if(ans==1)
                            return;
                        else if(ans==2)
                            continue;
                        else
                            System.out.println("....WRONG INPUT....");
                        break;
                    }
                default :
                    {
                        System.out.println("....INVALID INPUT....");
                    }
            }
            System.out.println("Do you want to continue ?\n1.Yes\n2.No");
                int ch=in.nextInt();
                if(ch==2)
                return;
        }
    }
    public static void main(String[] args) 
    {
        System.out.println("enter account number ");
        long acc=in.nextLong();
        System.out.println("enter the pin");
        int i=0;
        for(i=0;i<3;i++)
        {
            int pin=in.nextInt(); //pin=123
            if(pin==123)
            {
                startatm();
                System.out.println("Thanks for connecting with us....");
                break;
            }
            else
            {
                System.out.println("....INCORRECT PIN...."+(3-i-1)+" CHANCES LEFT !!!...");
            }
        }
        if(i==3)
            System.out.println("XXXXXX YOUR ACCOUNT HAS BEEN BLOCKED XXXXXX");
    }
}