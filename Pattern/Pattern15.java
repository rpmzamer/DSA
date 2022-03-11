import java.util.Scanner;

public class Pattern15 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int row=1,nstar=1,nspace=n/2,num=1,temp;
        while(row<=n)
        {
            for(int i=1;i<=nspace;i++)
            {
                System.out.print("\t");
            }
            temp=num;
            for(int i=1;i<=nstar;i++)
            {
                System.out.print(temp+"\t");
                if(i<(nstar/2)+1)
                {
                 temp++;
                }
                else
                {
                 temp--;                   
                } 
            }
            System.out.println();
            if(row<=n/2)
            {
                nspace-=1;
                nstar+=2;
                num++;
            }
            else
            {
                nspace+=1;
                nstar-=2;
                num--;
            }
            row++;
        }
    }
}