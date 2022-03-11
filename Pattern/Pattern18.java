import java.util.*;

public class Pattern18{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n=scn.nextInt(),r=1,nspace=0,nstar=n;
    while(r<=n)
    {
        for(int i=1;i<=nspace;i++)
        {
            System.out.print("\t");
        }
        for(int i=1;i<=nstar;i++)
        {
            if(r>1 && r<=n/2){ 
             if(i==1||i==nstar)
             {
                 System.out.print("*\t");
             }
             else
             {
                 System.out.print("\t");
             }
            }
            else
            {
                System.out.print("*\t");
            }
        }
        if(r<=n/2)
        {
            nspace++;
            nstar-=2;
        }
        else
        {
            nspace--;
            nstar+=2;
        }
        r++;
        System.out.println();
    }
 }
}