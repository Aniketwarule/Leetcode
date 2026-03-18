class Solution {
    public void nextPermutation(int[] nums) {
        int ind=-1;
        for(int i=nums.length-1;i>0;i--)
        {
            if(nums[i]>nums[i-1]) {
                ind = i-1;
                break;
            }
        }
        System.out.print(ind);
        if(ind==-1) nums=rev(nums,0);
        else{
            for(int i=nums.length-1;i>=ind;i--)
            {
                if(nums[i]>nums[ind])
                {
                    int temp =nums[i];
                    nums[i]=nums[ind];
                    nums[ind]=temp;
                    nums = rev(nums,ind+1);
                    break;
                }
            }
        }
    }
    private int[] rev(int[] nums,int ind)
    {
        int n=nums.length-1;
        for(int i=ind;i<n;i++)
        {
            int temp =nums[ind];
            nums[ind]=nums[n];
            nums[n--]=temp;
        }
        return nums;
    }
}