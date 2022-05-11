import java.io.*;
import java.util.*;

public class RotateAnArray{
  public static void display(int[] a){
    StringBuilder sb = new StringBuilder();

    for(int val: a){
      sb.append(val + " ");
    }
    System.out.println(sb);
  }

  public static void rotate(int[] a, int k)
  {
    int pos_k,high,low=0;
    int count=a.length;
    k=k%count;
    if(k<0)
    {
      k=count+k;
    }
    high=count-k-1;
    reverse(a,low,high);
    low=high+1;
    high=count-1;
    reverse(a,low,high);
    low=0;
    high=count-1;
    reverse(a,low,high);
  }

  public static void reverse(int []a,int low,int high)
  {
    int temp;
    while(low<high)
    {
      temp=a[low];
      a[low]=a[high];
      a[high]=temp;
      low++;
      high--;
    }
  }

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }
    int k = Integer.parseInt(br.readLine());

    rotate(a, k);
    display(a);
 }

}