import java.io.*;
import java.util.*;

public class RemovePrime{
	public static int isPrime(int n)
	{
		int count=0;
		for(int div=2;div*div<=n;div++)
		{
			if(n%div==0)
			{
				return -1;
			}
		}
		return 0;
	}
	public static void solution(ArrayList<Integer> al)
	{
		for(int idx=al.size()-1;idx>-1;idx--)
		{
			if(isPrime(al.get(idx))!=-1)
			{
				al.remove(idx);
			}
		}
	}
	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		ArrayList<Integer> al = new ArrayList<>();
		for(int i = 0 ; i < n; i++)
		{
			al.add(scn.nextInt());
		}
		solution(al);
		System.out.println(al);
	}
}