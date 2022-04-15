public class GuessNumberHigherOrNumber_Leetcode{
    public int guessNumber(int n)
    {
        int low=1,high=n,mid;
        while(low<=high)
        {
            mid=low+(high-low)/2;
            if(guess(mid)==-1)
            {
                high=mid-1;
               
            }
            else if(guess(mid)==1)
            {
                low=mid+1;
            }
            else
            {
                return mid;
            } 
        }
        return 0;
    }
    
}
