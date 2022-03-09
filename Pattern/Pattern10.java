import java.util.*;

public class Pattern10 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int row=1,nstar=1,nspace=n/2;
        while(row<=n)
        {
            for(int i=1;i<=nspace;i++)
            {
                System.out.print("\t");
            }
            for(int i=1;i<=nstar;i++)
            {
                if(i==1||i==nstar)
               {
                   System.out.print("*\t");
               }
               else
               {
                   System.out.print("\t");  
               }

            }
            System.out.println();
            if(row<=n/2)
            {
                nspace-=1;
                nstar+=2;
            }
            else
            {
                nspace+=1;
                nstar-=2;
            }
            
            row++;
        }
    }
}