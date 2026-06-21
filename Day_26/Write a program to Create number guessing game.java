import java.util.*;
class guess_the_number
{
    static  Scanner in=new Scanner(System.in);
    public static void game() throws Exception
    {
        System.out.println("What do you think the number is ???? ");
        int n=in.nextInt();
        in.nextLine();
        System.out.println("Generating number...");
        Thread.sleep(1000);
        int m=(int)(Math.random()*10+1);
        System.out.println("The number is : "+m);
        if(n==m)
        System.out.println("YOU WIN !!!!");
        else
        System.out.println("BETTER LUCK NEXT TIME ");
    System.out.println("Want to continue ?");
    System.out.println("Type yes to continue and no to stop");
    String ans=in.nextLine();
    if(ans.equalsIgnoreCase("yes"))
        game();
    else
        return;
    }
    public static void main(String[] args) throws Exception 
    {
        
        System.out.println("===================");
        System.out.println("  GUESS THE NUMBER ");
        System.out.println("    RANGE : 1-10 ");
        System.out.println("===================");
        game();
        System.out.println("Thanks for playing !!!");
    }
}