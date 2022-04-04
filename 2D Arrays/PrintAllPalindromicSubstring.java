import java.io.*;
import java.util.*;

public class PrintAllPalindromicSubstring {
	public static boolean isPalindrome(String s)
	{
		int left=0,right=s.length()-1;
		while(left<right)
		{
			if(s.charAt(left)==s.charAt(right))
			{
				left++;
				right--;
			}
			else
			{
				return false;
			}
		}
		return true;
	}
	public static void palindromicSubstring(String str){
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<=str.length();j++)
			{
				if(isPalindrome(str.substring(i,j)))
				{
					System.out.println(str.substring(i,j));
				}
			}
		}		
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		palindromicSubstring(str);
	}

}