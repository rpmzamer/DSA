class Solution {
    public int largestInteger(int number) {
        StringBuilder sb=new StringBuilder(number+"");
        for(int i=0;i<sb.length();i++)
        {
            int maxIdx=i;
            if(isEven(sb.charAt(i)))
            {
                maxIdx=findNextMaxEven(sb,i);
            }
            else
            {
                maxIdx=findNextMaxOdd(sb,i);
            }
            if(maxIdx!=i)
            {
                char temp=sb.charAt(i);
                char temp2=sb.charAt(maxIdx);
                sb.setCharAt(i,temp2);
                sb.setCharAt(maxIdx,temp);
            }
         }
        return Integer.parseInt(sb.toString());
    }      
    
    public boolean isEven(char a)
    {
        if((a%2)==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public int findNextMaxEven(StringBuilder sb,int idx)
    {
        int max=idx;
        for(int j=idx+1;j<sb.length();j++)
        {
            if(sb.charAt(j)>sb.charAt(max) && isEven(sb.charAt(j)))
            {
                max=j;
            }
        }
        return max;
    }
     public int findNextMaxOdd(StringBuilder sb,int idx)
    {
        int max=idx;
        for(int j=idx+1;j<sb.length();j++)
        {
            if(sb.charAt(j)>sb.charAt(max) && !(isEven(sb.charAt(j))))
            {
                max=j;
            }
        }
        return max;
    }
}