import java.util.*;

public class Pattern8 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=n-i;j>=1;j--)
            {
             System.out.print("\t");
            }
            System.out.print("*\t");
            System.out.println();
        }    
    }
}