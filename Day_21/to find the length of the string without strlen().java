import java.util.*;
class stringlength
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the string");
        String str=in.nextLine();
        char arr[] = str.toCharArray();
        int count = 0;
        for (char ch : arr) {
            count++;
        }
        System.out.println("Length of the string = " + count);
    }
}
    