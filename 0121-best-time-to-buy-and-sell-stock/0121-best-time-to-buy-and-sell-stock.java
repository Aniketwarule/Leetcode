class Solution {
    public int maxProfit(int[] nums) {
        
        int maxi=0;
        int mini=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            maxi = Math.max(maxi,nums[i]-mini);
            mini = Math.min(mini,nums[i]);
        }
        return maxi;
    }
}