import java.util.*;
class namesort
{
    public static void main(String[] args) 
    {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the number of names");
        int n=in.nextInt();
        in.nextLine();
        System.out.println("enter the names ");
        String name[]=new String[n];
        for(int i=0; i<n;i++)
        {
            name[i]=in.nextLine();
        }
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if (name[i].compareTo(name[j]) > 0)
                {
                    String temp = name[i];
                    name[i] = name[j];
                    name[j] = temp;
                }
            }
        }
        System.out.println("names in alphabetical order : ");
        for(int i=0; i<n;i++)
        {
            System.out.println(name[i]);
        }
    }
}