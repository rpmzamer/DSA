import java.io.*;
import java.util.*;

public class PrintAllPermutationsOfAStringIteratively {

    public static int fact(int n)
	{
		int ans=1;
		for(int i=2;i<n+1;i++)
		{
			ans=ans*i;
		}
		return ans;
	}
	public static void solution(String str){
		int lenStr=str.length(),rem,div,temp;
		int factorial=fact(lenStr);
		for(int i=0;i<factorial;i++)
		{
			StringBuilder sb = new StringBuilder(str);
			temp=i;
			for(int j=lenStr;j>0;j--)
			{
				div=temp/j;
				rem=temp%j;
				System.out.print(sb.charAt(rem));
                sb.deleteCharAt(rem);
				temp=div;
			}
            System.out.println();
		}
	}
	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);

	}
}