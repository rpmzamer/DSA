import java.util.*;

public class Pattern12 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt(),row=1,num=0,temp=1,sum;
        
        while(row<=n)
        {
            for(int i=1;i<=row;i++)
            {
              System.out.print(num+"\t");
              sum=temp+num;
              num=temp;
              temp=sum;
            }
            System.out.println();
            row++;
        }

    }
}