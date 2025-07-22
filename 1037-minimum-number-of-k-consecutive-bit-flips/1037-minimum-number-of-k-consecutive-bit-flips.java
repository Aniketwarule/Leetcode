class Solution {
    public int minKBitFlips(int[] nums, int k) {
        int ans=0;
        int time=0;
        int[] flip = new int[nums.length];

        for(int i=0;i<nums.length;i++)
        {
            if(i>=k)
            {
                time-=flip[i-k];
            }
            if((nums[i]==1 &&time%2==1)||(nums[i]==0 && time%2==0))
            {
                if(i+k>nums.length) return -1;
                ans++;
                time++;
                flip[i]=1;
            }
        }
        return ans;
    }
}