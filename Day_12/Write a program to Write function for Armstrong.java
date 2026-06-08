import java.util.*;
class numberarmstrong
{
    void arm(int x)
    { 
       int y=x;
       double sum=0.0;
       int pow=Integer.toString(x).length();
       while(x!=0)
       {
        int temp=x%10;
        sum=sum+Math.pow(temp,pow);
        x=x/10;
       }
       if(sum==y)
        System.out.println("number is an armstrong number");
       else
        System.out.println("numebr is not an armstrong number");
    }
   void main(String args[])
   {
    Scanner in=new Scanner(System.in);
    System.out.println("enter the value of a ");
    int a=in.nextInt();
    arm(a);
   } 
}