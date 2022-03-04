import java.util.Scanner;

public class Pattern11 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt(),count=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j=j+1)
            {
             
                 System.out.print(count+"\t");
                 count=count+1;
             
            }
            System.out.println();
        }    
    }
}