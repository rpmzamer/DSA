import java.util.*;

public class Pattern16{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n=scn.nextInt(),r=1;
    int nspace=2*n-3,j;
    while(r<=n)
    {
        for(int i=1;i<=r;i++)
        {
            System.out.print(i+"\t");
        }
        for(int i=1;i<=nspace;i++)
        {
            System.out.print("\t");
        }
        if(r==n)
        {
            j=n-1;
        }
        else
        {
            j=r;
        }
        while(j>=1)
        {
            System.out.print(j+"\t");
            j--;
        }
        r++;
        nspace-=2;
        System.out.println();
    }
 }
}