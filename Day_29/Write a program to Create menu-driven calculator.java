import java.util.*;
class calculator
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        while(true)
        {
            System.out.println("\n===== CALCULATOR =====");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Modulus");
            System.out.println("6. Exit");
            System.out.print("Enter Choice: ");
            int ch = in.nextInt();
            if(ch == 6)
            {
                System.out.println("Program Ended");
                break;
            }
            System.out.print("Enter First Number: ");
            double a = in.nextDouble();
            System.out.print("Enter Second Number: ");
            double b = in.nextDouble();
            switch(ch)
            {
                case 1:
                    System.out.println("Result = " + (a + b));
                    break;

                case 2:
                    System.out.println("Result = " + (a - b));
                    break;

                case 3:
                    System.out.println("Result = " + (a * b));
                    break;

                case 4:
                    if(b != 0)
                        System.out.println("Result = " + (a / b));
                    else
                        System.out.println("Division by Zero Not Possible");
                    break;

                case 5:
                    System.out.println("Result = " + (a % b));
                    break;

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}