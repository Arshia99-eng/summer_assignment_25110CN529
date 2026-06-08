import java.util.*;
class numberfib
{
    void fibonacci(int x)
    { int first=0,next=0;
      for(int i=1;i<=x;i++)
      {
        if(i==1)
        {
           first=0;
           next=1;
        }
        else
        {
            int a=first;
            first=next;
            next=next+a;
        }
        System.out.print(first+" ");
      }
    }
   void main(String args[])
   {
    Scanner in=new Scanner(System.in);
    System.out.println("enter the value of n ");
    int n=in.nextInt();
    fibonacci(n);
   } 
}