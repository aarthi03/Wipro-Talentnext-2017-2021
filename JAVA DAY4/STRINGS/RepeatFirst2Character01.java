import java.util.*;
import java.io.*;
public class RepeatFirstTwoCharacter01 
{
    public static void main(String[] args) 
    {
		String str = "Benny";
		int n = str.length();
		String rep = "";
        if (n < 2) 
        {
            rep = str;
        }
        else 
        {
            rep = str.substring(0, 2);
        }
		String output = "";
        for (int i = 0; i < n; i++) 
        {
			output =output + rep;
		}
		System.out.println(output);
    }
}