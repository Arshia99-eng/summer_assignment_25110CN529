import java.util.*;
class number
{
   int max=0;
    void max(int x, int y)
    {
       if(x>y)
        max=x;
       else
        max=y;
    System.out.println("the maximum of the two number is : "+max);
    }
   void main(String args[])
   {
    Scanner in=new Scanner(System.in);
    System.out.println("enter the value of a ");
    int a=in.nextInt();
    System.out.println("enter the value of b");
    int b=in.nextInt();
    max(a,b);
   } 
}