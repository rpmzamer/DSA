import java.io.*;
import java.util.*;

public class StringCompression {

	public static String compression1(String str)
	{
		int idx=0;
		String res="";
		char prev=',';
		while(idx<str.length())
		{
			if(str.charAt(idx)!=prev)
			{
				res=res+str.charAt(idx);
			}
			prev=str.charAt(idx);
			idx++;
		}
		return res;
	}

	public static String compression2(String str)
	{
		int idx=1,count=1;
		String res=""+str.charAt(0);
		char prev=str.charAt(0);
		while(idx<str.length())
		{
			if(str.charAt(idx)!=prev)
			{
				if(count>1)
				{
					res=res+count;
				}
				res=res+str.charAt(idx);
				count=1;
			}
			else if(idx==str.length()-1 && str.charAt(idx)==prev)
			{
				count++;
				res=res+count;
			}
			else 
			{
				count++;
			}
			
			prev=str.charAt(idx);
			idx++;
		}
		return res;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(compression1(str));
		System.out.println(compression2(str));
	}

}