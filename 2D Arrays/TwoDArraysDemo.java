import java.util.*;
  
  public class TwoDArraysDemo{
  
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
        System.out.print(mat2[r][c]+" ");
      }
      System.out.println();
    }
    }
  
  public static void main(String[] args) {
    Scanner scn= new Scanner(System.in);
    int nr = scn.nextInt();
    int nc = scn.nextInt();
    int [][]mat = new int[nr][nc];
    
    input(mat,scn);
    display(mat);   
   }
  }