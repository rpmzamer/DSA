import java.util.Scanner;
public class Pattern3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        for(int i=1;i<=n;i=i+1)
        {
            
            for(int j=n;j>i;j=j-1)
            {
              System.out.print("\t");
            }
            for(int k=1;k<=i;k=k+1)
            {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }

}
