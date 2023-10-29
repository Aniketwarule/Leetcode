class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int count=0;
        int c=0;
        for(int i=0;i<nums.length-1;i++)
        {
            if(count==0) count++;
            if(nums[i]<nums[i+1])
            {
                if(nums[i]==nums[i+1]-1){
                    count++;
                }
                else count=0;
            }
            if(count>c) c=count;
        }
        if(nums.length==1) return 1;
        return c;
    }
}