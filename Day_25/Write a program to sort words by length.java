import java.util.*;
class wordsort
{
    public static void main(String[] args) 
    {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the number of words");
        int n=in.nextInt();
        in.nextLine();
        System.out.println("enter the words");
        String words[]=new String[n];
        for(int i=0; i<n;i++)
        {
            words[i]=in.nextLine();
        }
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if (words[i].length()>words[j].length())
                {
                    String temp = words[i];
                    words[i] = words[j];
                    words[j] = temp;
                }
            }
        }
        System.out.println("words in increasing order of length : ");
        for(int i=0; i<n;i++)
        {
            System.out.println(words[i]);
        }
    }
}