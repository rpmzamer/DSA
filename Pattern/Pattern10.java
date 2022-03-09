import java.util.*;

public class Pattern10{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n=scn.nextInt();
    int row=1,inrspac=1,nspace=n/2,i;
        while(row<=n)
        {
            for(i=1;i<=nspace;i++)
            {
                System.out.print("\t");
            }
            if(row==1 || row==n)
            {
               System.out.print("*\t"); 
            }
            else
            {
                System.out.print("*\t");
                for(i=1;i<=inrspac;i++)
                {
                    System.out.print("\t");
                }
                System.out.print("*\t");
            }
            System.out.println();
            if(row<=n/2)
            {
                nspace-=1;
                if(row!=1 && row!=n)
                {
                    inrspac+=2;
                }
            }
            else
            {
                nspace+=1;
                if(row!=1 && row!=n)
                {
                    inrspac-=2;
                }
                
            }
            
            row++;
        }
 }
}