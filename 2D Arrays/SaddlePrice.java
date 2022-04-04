import java.io.*;
import java.util.*;

public class SaddlePrice {
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
    public static int saddlePrice(int mat[][])
    {

        int n=mat.length,min=0,max=0,rmin=0,cmin=0,rcol=0;;
        for(int r=0;r<n;r++)
        {
            min=mat[r][0];
            for(int c=0;c<n;c++)
            {
                if(mat[r][c]<=min)
                {
                max=mat[r][c];
                rmin=r;
                cmin=c;
                }
            }
            max=mat[0][cmin];
            for(int i=0;i<n;i++)
            {
                if(mat[i][cmin]>=max)
                {
                    max=mat[i][cmin];
                }
            }
            if(max==min)
            {
                System.out.println(max);
                return 0;
            } 
        }
        System.out.println("Invalid input");
        return 0;
    }
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [][]mat = new int[n][n];
        input(mat,scn);
        saddlePrice(mat);
    }
}