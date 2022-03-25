import java.io.*;
import java.util.*;

public class BrokenEconomy{

public static void main(String[] args) throws Exception
 {
    Scanner scn =new Scanner(System.in);
    int n=scn.nextInt();
    int arr[]=new int[n],low=0,high=n-1,ans=-1;
    for(int i=0;i<n;i++)
    {
        arr[i]=scn.nextInt();
    }
    int d=scn.nextInt();
    while(low<=high)
    {
        if(d<arr[low+high/2])
        {
            high=low+high/2-1;
        }
        else if(d>arr[low+high/2])
        {
            low=low+high/2-1;
        }
        else
        {
            ans=low+high/2;
            System.out.println(ans);
            break;
        }
    }
    if (ans==-1)
    {
        System.out.println(high);
        System.out.println(low);
    }
  
 }

}