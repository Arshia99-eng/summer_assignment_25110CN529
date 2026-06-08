import java.util.*;
class numberpalin
{
    void palin(int x)
    { int y=x;
      String rev="";
     while(x!=0)
      {
        int temp=x%10;
        rev=rev+Integer.toString(temp);
        x=x/10;
      }  
    if(Integer.valueOf(rev)==y)
      System.out.println("number is palindrome");
    else
      System.out.println("not a palondrome");
    }
   void main(String args[])
   {
    Scanner in=new Scanner(System.in);
    System.out.println("enter the value of a ");
    int a=in.nextInt();
    palin(a);
   } 
}