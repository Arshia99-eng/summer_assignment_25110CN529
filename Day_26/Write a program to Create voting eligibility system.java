import java.util.*;
class vote
{
    public static void main(String[] args) 
    {
     Scanner in=new Scanner(System.in);
     System.out.println("enter the age of the candidate");
     int age=in.nextInt();
     if(age>18)
        System.out.println("Go ahead !!....you can vote");
     else if(age<=18)
        System.out.println("Wait till you are 18+"); 
     else
        System.out.println("enter a valid age");   
    }
}