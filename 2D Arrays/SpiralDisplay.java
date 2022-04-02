import java.io.*;
import java.util.*;
public class SpiralDisplay {
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
    public static void spiralDisplay(int mat[][])
    {
        int rlen=mat.length;
        int clen=mat[0].length;
        int rmin=0,rmax=rlen-1,cmin=0,cmax=clen-1,i=0,count=0;
        while(count<rlen*clen)
        {
            //left wall
            for(i=rmin;i<=rmax && count<rlen*clen;i++)
            {
                System.out.println(mat[i][cmin]);
                count++;
            }
            cmin++;
            //bottom wall
            for(i=cmin;i<=cmax && count<rlen*clen;i++)
            {
                System.out.println(mat[rmax][i]);
                count++;
            }
            rmax--;
            //right wall
            for(i=rmax;i>=rmin && count<rlen*clen;i--)
            {
                System.out.println(mat[i][cmax]);
                count++;
            }
            cmax--;
            // top wall
            for(i=cmax;i>=cmin && count<rlen*clen;i--)
            {
                System.out.println(mat[rmin][i]);
                count++;
            }
            rmin++;
        }
    }
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int r = scn.nextInt();
        int c =  scn.nextInt();
        int [][]mat = new int[r][c];
        input(mat,scn);
        spiralDisplay(mat);
    }

}