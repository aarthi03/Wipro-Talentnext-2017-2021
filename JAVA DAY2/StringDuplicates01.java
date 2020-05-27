import java.util.*;
import java.io.*;
public class StringDuplicates01 
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the String to which you need to remove duplicates:");
        String str1=s.nextLine();
        System.out.print("String after removing duplicates is:");
        System.out.println(RemoveDuplicates(str1));
    }
    public static String RemoveDuplicates(String str1)
    {
        String str2=new String();
        for(int i=0;i<str1.length();i++)
        {
            char c=str1.charAt(i);
            if(str2.indexOf(c)<0)
            {
                str2=str2+c;
            }
        } 
        return str2;
    }
}
© 2020 GitHub, Inc.