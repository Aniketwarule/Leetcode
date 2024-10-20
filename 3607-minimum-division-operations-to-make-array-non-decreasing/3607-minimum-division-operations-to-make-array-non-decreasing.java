class Solution {
    public int minOperations(int[] n) {
        
        int ans=0;
        for(int i=n.length-2;i>=0;i--)
        {
            if(n[i]>n[i+1]) 
            {
                n[i] = fuck(n[i],n[i+1]);
                if(n[i]==-1) return -1;
                ans++;
            }
        }
        return ans;
    }
    public int fuck(int n, int tar)
    {
        for(int i=2;i<=tar;i++)
        {
            if(n%i==0) return i;
        }
        return -1;
    }
}