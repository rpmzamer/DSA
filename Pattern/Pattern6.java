import java.util.Scanner;
public class Pattern6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int row=1,nstar=(n/2)+1,nspace=1;
        while(row<=n)
        {
            for(int i=1;i<=nstar;i++)
            {
                System.out.print("*\t");
            }
            for(int i=1;i<=nspace;i++)
            {
                System.out.print("\t");
            }
            for(int i=1;i<=nstar;i++)
            {
                System.out.print("*\t");
            }
            if(row<=n/2)
            {
                nstar-=1;
                nspace+=2;
            }
            else
            {
                nstar+=1;
                nspace-=2;
            }
            System.out.println();
            row++;
        }

    }
}
