import java.util.*;
class stringoperations
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = in.nextLine();
        while(true)
        {
            System.out.println("\n===== STRING OPERATIONS =====");
            System.out.println("1. Display String");
            System.out.println("2. Find Length");
            System.out.println("3. Convert to Uppercase");
            System.out.println("4. Convert to Lowercase");
            System.out.println("5. Reverse String");
            System.out.println("6. Check Palindrome");
            System.out.println("7. Exit");
            System.out.print("Enter Choice: ");
            int ch = in.nextInt();
            switch(ch)
            {
                case 1:
                    System.out.println("String = " + str);
                    break;

                case 2:
                    System.out.println("Length = " + str.length());
                    break;

                case 3:
                    System.out.println("Uppercase = " + str.toUpperCase());
                    break;

                case 4:
                    System.out.println("Lowercase = " + str.toLowerCase());
                    break;

                case 5:
                    String rev = "";

                    for(int i=str.length()-1;i>=0;i--)
                        rev += str.charAt(i);

                    System.out.println("Reverse = " + rev);
                    break;

                case 6:
                    String r = "";

                    for(int i=str.length()-1;i>=0;i--)
                        r += str.charAt(i);

                    if(str.equalsIgnoreCase(r))
                        System.out.println("Palindrome");
                    else
                        System.out.println("Not Palindrome");

                    break;

                case 7:
                    System.out.println("Program Ended");
                    return;

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}