import java.io.*;
import java.util.*;

public class PrintAllPermutationsOfAStringIteratively {

    public staic int fact(int n)
	{
		int ans=1;
		for(int i=2;i<n+1;i++)
		{
			ans=ans*i;
		}
		return ans;
	}
	public static void solution(String str){
		int lenStr=str.length,rem,div,temp;
		int factorial=fact(lenStr);
		for(int i=0;i<factorial;i++)
		{
			StringBuilder sb = new StringBuilder(str);
			temp=i;
			for(int j=0;j<lenStr;j++)
			{
				div=temp/i;
				rem=temp%i;
				System.out.print(sb.charAt());
			}
		}
	}
	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);

	}
}