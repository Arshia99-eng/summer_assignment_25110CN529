import java.util.*;
class num
{
   int sum=0;
    void sum(int x, int y)
    {
       sum=x+y;
       System.out.println("the sum of "+x+" and "+y+" is : "+sum);
    }
   void main(String args[])
   {
    Scanner in=new Scanner(System.in);
    System.out.println("enter the value of a ");
    int a=in.nextInt();
    System.out.println("enter the value of b");
    int b=in.nextInt();
    sum(a,b);
   } 
}