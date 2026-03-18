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
        if(ind==-1) rev(nums,0,nums.length-1);
        else{
            for(int i=nums.length-1;i>ind;i--)
            {
                if(nums[i]>nums[ind])
                {
                    int temp =nums[i];
                    nums[i]=nums[ind];
                    nums[ind]=temp;
                    rev(nums,ind+1,nums.length-1);
                    break;
                }
            }
        }
    }
    private int[] rev(int[] nums,int s,int e)
    {
        while(e>s)
        {
            int temp =nums[s];
            nums[s++]=nums[e];
            nums[e--]=temp;
        }
        return nums;
    }
}