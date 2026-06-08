import java.util.*;
class numberfact
{
   int fact=1;
    void factorial(int x)
    {
      for(int i=1;i<=x;i++)
      {
        fact=fact*i;
      }
    System.out.println("factorial of "+x+" is "+fact);
    }
   void main(String args[])
   {
    Scanner in=new Scanner(System.in);
    System.out.println("enter the value of a ");
    int a=in.nextInt();
    factorial(a);
   } 
}