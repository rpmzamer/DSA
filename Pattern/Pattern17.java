import java.util.Scanner;

public class Pattern17 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int row=1,nstar=1;
        while(row<=n)
        {
            for(int i=1;i<=n/2;i++)
            {   
                if(row==(n/2)+1)
                {
                    System.out.print("*\t");
                }
                else
                {
                    System.out.print("\t");
                }    
            }
            for(int i=1;i<=nstar;i++)
            {
                System.out.print("*\t");
            }
            if(row<=n/2)
            {
                nstar++;
            }
            else
            {  nstar--;
            }
            System.out.println();
            row++;
        }              
        
    }
}