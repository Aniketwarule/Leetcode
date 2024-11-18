class Solution {
    public int[] decrypt(int[] code, int k) {
        
        int[] ans = new int[code.length];
        if(k>0)
        {
            for(int i=0;i<code.length;i++)
            {
                int sum =0;
                int j = k;
                while(j>0)
                {
                    sum+=code[(i+j)%code.length];
                    j--;
                }
                ans[i]= sum;
            }
        }
        else if(k==0) return ans;
        else 
        {
            for(int i=0;i<code.length;i++)
            {
                int sum =0;
                int j = Math.abs(k);
                while(j>0)
                {
                    sum+=code[Math.abs((code.length+i-j))%code.length];
                    j--;
                }
                ans[i]= sum;
            }
        }
        return ans;
    }
}