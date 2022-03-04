import java.util.*;
    
    public class Q27GcdAndLcm{
    
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int num1=scn.nextInt();
        int num2=scn.nextInt();
        int rem=1,divident=num1,divisor=num2;
        while(rem!=0)
        {
            rem=divident%divisor;
            divident=divisor;
            divisor=rem;
        }
        System.out.println(divident);
        System.out.println(num1*num2/divident);
     }
    }