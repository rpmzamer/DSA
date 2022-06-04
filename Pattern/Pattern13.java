import java.util.*;
public class Pattern13{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for(int r=0;r<n;r++)
        {
            int ncr = 1;
            for(int c=0;c<=r;c++)
            {
                System.out.print(ncr+"\t");
                int ncrP1=((r-c)*ncr)/(c+1);
                ncr=ncrP1;
            }
            System.out.println();
        }
    }
}