import java.io.*;
import java.util.*;

public class PrintZigzag {

    public static void main(String[] args) throws Exception {
        pzz(new Scanner(System.in).nextInt());
    }

    public static void pzz(int n){
        if(n==0)
        {
            return;
        }
        System.out.print(n+" ");
        pzz(n-1);
        System.out.print(n+" ");
        pzz(n-1);
        System.out.print(n+" ");
    }

}