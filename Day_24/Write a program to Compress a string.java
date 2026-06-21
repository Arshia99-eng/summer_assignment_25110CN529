import java.util.*;
class compressedstring
{
    public static void main(String[] args) 
    {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the string");
        String str=in.nextLine();
        String cmp=" ";
        for(int i=0; i<str.length(); i++)
        {
            int count=1;
            while(i<str.length()-1&&str.charAt(i)==str.charAt(i+1))
            {
                count++;
                i++;
            }
            cmp=cmp+str.charAt(i)+count;
        }
        System.out.println("cpmressed string : "+cmp);
    }
}