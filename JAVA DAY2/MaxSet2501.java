import java.util.*;
import java.io.*;
public class MaxSet2501
{
    public static void main(String[]args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the No Of Array elements:");
        int n=s.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the array elements:");
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        int m=a[0];
        for(int i=0;i<n;i++)
        {
            if(m<a[i])
            {
                m=a[i];
            }
        }
        System.out.println("Maximum number in the array is " +m);
    }
}