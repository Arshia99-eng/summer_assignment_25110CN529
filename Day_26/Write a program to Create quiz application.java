import java.util.*;
class quiz
{
    static  Scanner in=new Scanner(System.in);
    static int pt=0;
    public static void que()
    {
        while(true)
        {
            System.out.println("In which film does Aamir Khan play an alien who lands on Earth and befriends a journalist?");
            System.out.println("OPTIONS : ");
            System.out.println("A)PK                    B)Lagaan");
            System.out.println("C)Secret Superstar      D)Dhoom 3");
            System.out.print("YOUR ANSWER : ");
            char ch1=in.next().charAt(0);
            if(ch1=='A')
            {
                System.out.println("CONGRATULATIONS !!!!");
                pt+=5;
            }
            else
            {
                System.out.println("CORRECT ANSWER IS : A");
            }
            System.out.println("Which film features Rancho, Farhan, and Raju as university friends navigating through life’s ups and downs?");
            System.out.println("OPTIONS : ");
            System.out.println("A)PK            B)Lagaan");
            System.out.println("C)3 Idiots      D)Dhoom 3");
            System.out.print("YOUR ANSWER : ");
            char ch2=in.next().charAt(0);
            if(ch2=='C')
            {
                System.out.println("CONGRATULATIONS !!!!");
                pt+=5;
            }
            else
            {
                System.out.println("CORRECT ANSWER IS : C");
            }
            System.out.println("Which film revolves around a wrestler's journey, starring Salman Khan?");
            System.out.println("OPTIONS : ");
            System.out.println("A)PK                    B)Sultan");
            System.out.println("C)Secret Superstar      D)Dhoom 3");
            System.out.print("YOUR ANSWER : ");
            char ch3=in.next().charAt(0);
            if(ch3=='B')
            {
                System.out.println("CONGRATULATIONS !!!!");
                pt+=5;
            }
            else
            {
                System.out.println("CORRECT ANSWER IS : B");
            }
            System.out.println("In which film does Hrithik Roshan play a superhero?");
            System.out.println("OPTIONS : ");
            System.out.println("A)Krish                 B)Lagaan");
            System.out.println("C)Secret Superstar      D)Dhoom 3");
            System.out.print("YOUR ANSWER : ");
            char ch4=in.next().charAt(0);
            if(ch4=='A')
            {
                System.out.println("CONGRATULATIONS !!!!");
                pt+=5;
            }
            else
            {
                System.out.println("CORRECT ANSWER IS : A");
            }
            System.out.println("Which film is about a father training his daughters to become wrestling champions?");
            System.out.println("OPTIONS : ");
            System.out.println("A)PK                    B)Lagaan");
            System.out.println("C)Secret Superstar      D)Dangal");
            System.out.print("YOUR ANSWER : ");
            char ch5=in.next().charAt(0);
            if(ch5=='D')
            {
                System.out.println("CONGRATULATIONS !!!!");
                pt+=5;
            }
            else
            {
                System.out.println("CORRECT ANSWER IS : D");
            }
           System.out.println("YOUR SCORE : "+pt+"/25");
           System.out.println("DO YOU WANT TO PLAY AGAIN ?\n1.Yes\n2.No");
           int key=in.nextInt();
           if(key==1)
            continue;
           else
           {
            pt=0;
            return;
           }
        }
    }
    public static void main(String[] args) 
    {
        System.out.println("================");
        System.out.println("   MOVIE QUIZ   ");
        System.out.println("================");
        que();
        System.out.println("THANKS FOR PLAYING !!!");

    }
}