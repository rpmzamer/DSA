import java.io.*;
import java.util.*;


public class Main{

public static void main(String[] args)
{
    Scanner scn =new Scanner(System.in);
    int n1=scn.nextInt();
    int arr1[]=new int[n1];
    int arr2[]=new int[n2];
    int result=new int[Math.max(n1,n2)];
    for(int i=0;i<n1;i++)
    {
        arr1[i]=scn.nextInt();
    }
    int n2=scn.nextInt();
    for(int i=0;i<n2;i++)
    {
        arr2[i]=scn.nextInt();
    }
         
 }
 public static int[] sumOfArray(int[] arr1,int[] arr2)
 {
     int n1=arr1.length,n2=arr2.length;
     int n3=Math.max(n1,n2);
     int result[]=new int[n3];
     int p1=n1-1,p2=n2-1,p3=n3-1,carry,sum,digit;
     while(p1!=0||p2!=0)
     {
         sum=arr1[p1]+arr2[p2];
         digit=sum%10;
         carry=sum/10;
         result[p3]=digit;
         p1--;
         p2--;
         p3--;
     }
     if (carry!=0)
     {
         
     }
 }
}