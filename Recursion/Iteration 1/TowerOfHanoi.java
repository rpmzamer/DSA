import java.io.*;
import java.util.*;

public class TowerOfHanoi {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int src=scn.nextInt();
        int des=scn.nextInt();
        int help=scn.nextInt();
        toh(n,src,des,help);
    }

    public static void toh(int n, int src, int des, int help){
        if(n==0)
        {
            return;
        }
        toh(n-1,src,help,des);
        System.out.println(n+"["+src+" -> "+des+"]");
        toh(n-1,help,des,src);
    }

}