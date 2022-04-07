import java.io.*;
import java.util.*;

public class StringWithDifference {

	public static String solution(String str)
	{
		StringBuilder sb = new StringBuilder();
		char ch='/';
		int diff;
		sb.append(str.charAt(0));
		for(int i=0;i<str.length()-1;i++)
		{
			
			diff=(char)str.charAt(i+1)-str.charAt(i);
			sb.append(diff);
			sb.append(str.charAt(i+1));
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(solution(str));
	}

}