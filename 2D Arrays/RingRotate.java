import java.io.*;
import java.util.*;

public class RingRotate {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int nr = scn.nextInt();
        int nc = scn.nextInt();
        int mat[][] = new int[nr][nc];
        for(int i=0;i<nr;i++)
        {
            for(int j=0;j<nc;j++)
            {
                mat[i][j] = scn.nextInt();
            }
        }
        int shell = scn.nextInt();
        int k = scn.nextInt();
        ringRotate(mat,shell,k);
        display(mat);
    }
    
    public static void ringRotate(int [][] mat,int shell,int k)
    {
        Integer arr[] = fill1d(mat,shell);
        rotate(arr,k);
        fill2d(mat,shell,arr);      
    }
    public static Integer[] fill1d(int mat[][],int shell)
    {
      int nr = mat.length, nc = mat[0].length,i;
      int rmin = shell -1, rmax = nr-shell, cmin=shell-1,cmax=nc-shell;
      ArrayList<Integer> list = new ArrayList<Integer>();
            //left wall
            for(i=rmin;i<=rmax;i++)
            {
                list.add(mat[i][cmin]);
            }
            //bottom wall
            for(i=cmin+1;i<=cmax;i++)
            {
                list.add(mat[rmax][i]);
            }
            //right wall
            for(i=rmax-1;i>=rmin;i--)
            {
                list.add(mat[i][cmax]);
            }
            // top wall
            for(i=cmax-1;i>cmin;i--)
            {
                list.add(mat[rmin][i]);
            }
        return list.toArray(new Integer[list.size()]);    
    }
    public static void fill2d(int[][] mat,int shell,Integer[] arr)
    {
        int nr = mat.length, nc = mat[0].length,i;
        int rmin = shell -1, rmax = nr-shell, cmin=shell-1,cmax=nc-shell;
        int idx=0;

            for(int r = rmin ; r <= rmax; r++){
            mat[r][cmin] = arr[idx];
            idx++;
        }
        // bottom wall
        for(int c = cmin+1 ; c <= cmax; c++){
            mat[rmax][c]  = arr[idx];
            idx++;
        }
        // right wall
        for(int r = rmax-1 ; r >= rmin; r--){
            mat[r][cmax] = arr[idx];
            idx++;
        }
        // top wall
        for(int c = cmax-1 ; c >= cmin+1; c--){
            mat[rmin][c] = arr[idx];
            idx++;
        }
    }
    public static void rotate(Integer [] a, int k)
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
    low=count-k;
    high=count-1;
    reverse(a,low,high);
    low=0;
    high=count-1;
    reverse(a,low,high);
  }

  public static void reverse(Integer []a,int low,int high)
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
    public static void display(int[][] arr)
    {
        for(int i = 0; i < arr.length; i++)
        { 
            for(int j = 0; j < arr[0].length; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}