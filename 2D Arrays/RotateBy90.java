import java.io.*;
import java.util.*;

public class RotateBy90 {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [][]mat =  new int[n][n];
        input(mat,scn);
        transpose(mat);
        rversRow(mat);
        display(mat);
    }
    public static void transpose(int mat1[][])
    {
        int n=mat1.length,temp=0;
        for(int r=0;r<n;r++)
        {
            for(int c=0;c<n;c++)
            {
                if(r!=c)
                {
                    if(r>c)
                    {
                        temp=mat1[r][c];
                        mat1[r][c]=mat1[c][r];
                        mat1[c][r]=temp;
                    }
                    
                }
                
            }
        }
    }
    public static void rversRow(int mat1[][])
    {
        int n = mat1.length,temp=0;
        for(int r=0;r<n;r++)
        {
            int endcol=n-1;
            for(int c=0;c<=n/2-1;c++)
            {
                temp=mat1[r][c];
                mat1[r][c]=mat1[r][endcol];
                mat1[r][endcol]=temp;
                endcol--;
            }
        }
    }
    public static void input(int [][]mat1,Scanner scn)
    {
      for(int r=0;r<mat1.length;r++)
      {
        for(int c=0;c<mat1[0].length;c++)
        {
          mat1[r][c]=scn.nextInt();
        }
      }
    }
    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}