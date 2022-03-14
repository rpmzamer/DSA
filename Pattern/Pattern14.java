import java.util.*;

public class Pattern14 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt(),mult;
        for(int i=1;i<11;i++)
        {
              mult=n*i;
              System.out.println(n+" * "+i+" = "+mult);
        }
    }
}      