public class Sqrt_Leetcode {
        public static int mySqrt(int x) 
        {
            if(x<2)
            {
                return x;
            }
        int left=2,right=x/2,mid;
        long sqr;
        while(left<=right)
        {
                mid=left+(right-left)/2;
                sqr=(long)mid*mid;
                if(x>sqr)
                {
                    left=mid+1;
                }
                else if(x<sqr)
                {
                    right=mid-1;
                }
                else
                {
                    return mid;
                }
        }
        return right;
        }
    
    public static void main(String[] args)
    {
        System.out.println(mySqrt(36));
    }    
}
