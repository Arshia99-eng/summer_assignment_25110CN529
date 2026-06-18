import java.util.*;
class wordcount
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the string");
        String str=in.nextLine().trim();
        if(str.isEmpty())
         {
            System.out.println("the string is empty");
            return;
         }
         String words[]=str.split("\\s+");
        System.out.println("the number of words in the string are "+words.length);
    }
}