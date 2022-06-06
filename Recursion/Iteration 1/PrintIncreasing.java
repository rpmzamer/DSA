import java.io.*;
import java.util.*;

public class PrintIncreasing {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        printIncreasing(n);
    }

    public static void printIncreasing(int n){
        if(n==0)  //Base Case
        {
            return;
        }
        printIncreasing(n-1);  //Faith
        System.out.println(n); 
    }

}