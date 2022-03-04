import java.util.*;
public class Q25RotateANumber{
   
   public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt(),num=n,count=0,p1,p2,temp,r;
        int k=scn.nextInt();
        while(num!=0)
       {
         num=num/10;
         count++;
       }
       k=k%count;
       if(k<0)
       {
           k=count+k;
       }
       temp=(int)Math.pow(10,k);
       p1=n/temp;
       p2=n%temp;
       r=p2*(int)Math.pow(10,count-k)+p1;
       System.out.println(r);
       
    
   }
    
}
