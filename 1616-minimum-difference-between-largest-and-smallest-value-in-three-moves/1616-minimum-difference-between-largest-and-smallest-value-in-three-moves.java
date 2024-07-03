class Solution {
    public int minDifference(int[] nums) {
        if(nums.length<=4) return 0;

        Arrays.sort(nums);
        int mi = nums[nums.length-1]-nums[0];
        for(int i=0;i<=3;i++)
        {
            mi = Math.min(mi, nums[nums.length-1-(3-i)]-nums[i]);
        }
        return mi;
    }
}