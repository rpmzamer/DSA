import java.io.*;
import java.util.*;

public class SpanOfArray{
    public static int span(int arr[])
    {
        int min=arr[0],max=arr[0];
        for(int val:arr)
        {
            if(val>max)
            {
                max=val;
            }
            else if(val<min)
            {
                min=val;
            }
        }
        return max-min;
    }
public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int arr[]=new int [n];
        for(int i=0;i<n;i++)
        {
            arr[i]=scn.nextInt();
        }
        System.out.print(span(arr));
 }

}