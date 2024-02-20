class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=i) return i;
            if(i+1==nums.length) return i+1;
        }
        return 0;
    }
}