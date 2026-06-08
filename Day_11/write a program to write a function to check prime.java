import java.util.*;
class numberprime
{
   int count=0;
    void prime(int x)
    {
      for(int i=1;i<=x;i++)
      {
        if(x%i==0)
            count++;
      }
    if(count==2)
        System.out.println("the number is prime");
    else
        System.out.println("the number is not prime");
    }
   void main(String args[])
   {
    Scanner in=new Scanner(System.in);
    System.out.println("enter the value of a ");
    int a=in.nextInt();
    prime(a);
   } 
}