import java.util.*;
class numberperfect
{
    void perfect(int x)
    { 
       int y=x;
       int sum=0;
        for(int i=1; i<=x;i++)
        {
            if(x%i==0&&i!=x)
            sum=sum+i;
        }
        if(sum==y)
            System.out.println("the number is a perfect number");
        else
            System.out.println("the number is not a perfect number");
    }
   void main(String args[])
   {
    Scanner in=new Scanner(System.in);
    System.out.println("enter the value of n ");
    int n=in.nextInt();
    perfect(n);
   } 
}