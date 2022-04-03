import java.io.*;
import java.util.*;

public class StateOfWakanda2 {
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
    public static void main(String[] args) throws Exception 
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [][]mat = new int [n][n];
        input(mat,scn);
        int ndiag=n,frow=0,fcol=0;

        for(int c=0;c<n;c++)
        {

            for(int i=0;i<ndiag;i++)
            {
                System.out.println(mat[i][fcol+i]);
            }
            ndiag--;
            fcol++;
        }
    }
}