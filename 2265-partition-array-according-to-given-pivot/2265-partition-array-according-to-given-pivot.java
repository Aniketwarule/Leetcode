class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        
        int ans[] = new int[nums.length];
        int ind=0;
        int ind2=nums.length-1;
        int j=ind2;
        for(int i=0;i<nums.length;i++,j--)
        {
            if(nums[i]<pivot) ans[ind++]=nums[i];
            if(nums[j]>pivot) ans[ind2--]=nums[j];
        }
        while (ind <= ind2) {
            ans[ind++] = pivot;
        }
        return ans;
    }
}