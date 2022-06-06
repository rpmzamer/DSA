import java.io.*;
import java.util.*;

public class Factorial {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(factorial(n));
    }

    public static int factorial(int n){
        if(n==0)
        {
            return 1;
        }
        int factnM1 = factorial(n-1);
        int factN = n*factnM1;
        return factN;
    }

}