import java.io.*;
import java.util.*;

public class StateOfWakanda{
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
     public static void display(int [][]mat2)
    {
       for(int r=0;r<mat2.length;r++)
    {
      for(int c=0;c<mat2[0].length;c++)
      {
        System.out.println(mat2[r][c]);
      }
    }
    }
    public static void stateOfWakanda(int arr[][],int r,int c)
    {
      for(int i=0;i<c;i++)
      {
        if(i%2!=0)
        {
          for(int j=r-1;j>=0;j--)
          {
            System.out.println(arr[j][i]);
          }
        }
        else
        {
          for(int j=0;j<r;j++)
          {
            System.out.println(arr[j][i]);
          }
        }  
      }
    }
public static void main(String[] args) throws Exception {
    Scanner scn= new Scanner(System.in);
    int r=scn.nextInt();
    int c=scn.nextInt();
    int [][]mat=new int [r][c];
    input(mat,scn);
    stateOfWakanda(mat,r,c);
 }

}