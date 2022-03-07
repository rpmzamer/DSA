import java.util.Scanner;
public class Pattern20 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        for(int row=1;row<=n;row++)
        {
            for(int col=1;col<=n;col++)
            {
                if(col==1 || col==n)
                {
                    System.out.print("*\t");
                }
                else if(row==col || row+col==n+1 )
                {
                    if(row>n/2)
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
                    System.out.print("\t");
                }    
            }
            System.out.println();
        }
    }
}

