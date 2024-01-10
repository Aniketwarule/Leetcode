class Solution {
    public int search(int[] nums, int tar) {
        int l=0;
        int r=nums.length-1;
        int mid;
        while(l<=r)
        {
            mid=(l+r)/2;
            if(nums[mid]==tar) return mid;
            if(nums[l]<=nums[mid])
            {
                if(nums[mid]>=tar && nums[l]<=tar)
                {
                    r=mid-1;
                }
                else{
                    l=mid+1;
                }
            }
            else
            {
                if(nums[mid]<=tar && nums[r]>=tar)
                {
                    l=mid+1;
                }
                else {
                    r=mid-1;
                }
            }
        }
        return -1;
    }
}