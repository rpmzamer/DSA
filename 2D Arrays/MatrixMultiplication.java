import java.io.*;
import java.util.*;

public class MatrixMultiplication{

    public static void input(int mat1[][], Scanner scn)
    {
      for(int r=0;r<mat1.length;r++)
    {
      for(int c=0;c<mat1[0].length;c++)
      {
        mat1[r][c]=scn.nextInt();
      }

    }

    }

    public static void display(int mat2[][])
    {
       for(int r=0;r<mat2.length;r++)
    {
      for(int c=0;c<mat2[0].length;c++)
      {
        System.out.print(mat2[r][c]+" ");
      }
      System.out.println();
    }

    }
    public static int[][] mutilplication(int matA[][],int matB[][])
    {
        int res[][]=null;
        int nr1=matA.length,nc1=matA[0].length;
        int nr2=matB.length,nc2=matB[0].length;
        if(nc1==nr2)
        {
          res = new int [nr1][nc2];
          for(int i=0;i<nr1;i++)
          {
            for(int j=0;j<nc2;j++)
            {
              for(int k=0;k<nc1;k++)
              {
                res[i][j]=res[i][j]+(matA[i][k]*matB[k][j]);
              }
            }
          }
        }
        else {
          System.out.println("Invalid input");
        }
        return res;
    }
    public static void main(String[] args) {
    Scanner scn= new Scanner(System.in);
    int nr = scn.nextInt();
    int nc = scn.nextInt();
    int [][]mat1 = new int[nr][nc];
    input(mat1,scn);

    nr = scn.nextInt();
    nc = scn.nextInt();
    int [][]mat2=new int[nr][nc];
    input(mat2,scn);
    if(mutilplication(mat1,mat2)!= null)
    {
      display(mutilplication(mat1,mat2));
    }
   }
  }
