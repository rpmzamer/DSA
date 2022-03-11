import java.io.*;
import java.util.*;

public class FindElementinArray{
    public static int find(int arr[],int e)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==e)
           {
               return i;
           }
        }
        return -1;
    }
       

public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n=scn.nextInt();
    int arr[]=new int[n],d;
    for(int i=0;i<n;i++)
    {
        arr[i]=scn.nextInt();
    }
    d=scn.nextInt();
    System.out.print(find(arr,d)); 
 }

}