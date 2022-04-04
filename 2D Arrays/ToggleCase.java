import java.io.*;
import java.util.*;

public class ToggleCase {
	public static String toggleCase(String str)
	{
		StringBuilder sb = new StringBuilder();
	
		char upper='.',lower=',',ch='/';
		for(int i=0;i<str.length();i++)
		{
			ch = str.charAt(i);
			if(ch>='a' && ch<='z')
			{
				upper = (char)((ch-'a')+'A');
				sb.append(upper);
			}
			else if(ch>='A' && ch<='Z')
			{
				lower=(char)((ch-'A')+'a');
				sb.append(lower);
			}
		}
		return sb.toString();
	}
	{

	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(toggleCase(str));
	}

}