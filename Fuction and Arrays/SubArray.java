import java.io.*;
import java.util.*;

public class SubArray{

public static void main(String[] args) throws Exception {
    Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    {
        arr[i]=scn.nextInt();
    }
    subarr(arr);
    
 }
 public static void subarr(int[] a)
 {
     int n=a.length;
     for(int i=0;i<n;i++)
     {
         for(int j=i;j<n;j++)
         {
             for(int k=i;k<=j;k++)
             {
                 System.out.print(a[k]+"\t");
             }
             System.out.println();
         }
     }
 }
}