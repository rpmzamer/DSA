import java.io.*;
import java.util.*;

public class ExitPointOfMatrix {
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
        public static void exitPointOfMatrix(int mat[][])
        {   
          int e=0,s=1,w=2,n=3,dir=0,rlen=mat.length,clen=mat[0].length;
          int r=0,c=0,rtemp=0,ctemp=0;
          while(r>=0 && c>=0 && r<rlen && c<clen)
          {
            rtemp=r;
            ctemp=c;
            dir=(dir+mat[r][c])%4;
            if(dir==0)
            {
              c++;
            }
            else if(dir==1)
            {
              r++;
            }
            else if(dir==2)
            {
              c--;
            }
            else if(dir==3)
            {
              r--;
            }
             
          }
           System.out.println(rtemp);
           System.out.println(ctemp);       
        }
    public static void main(String[] args) throws Exception
    {
        Scanner scn = new Scanner(System.in);
        int r = scn.nextInt();
        int c = scn.nextInt();
        int [][]mat = new int[r][c];
        input(mat,scn);
        exitPointOfMatrix(mat);
    }

}