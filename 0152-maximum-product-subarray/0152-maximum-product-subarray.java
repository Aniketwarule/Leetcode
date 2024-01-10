class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        // int maxMul=0;
        // if(n==1) return nums[0];
        // for(int i=0;i<=n-1;i++)
        // {
        //     for(int j=i+1;j<n;j++)
        //     {
        //         int temp=1;
        //         for(int k=i;k<j;k++)
        //         {
        //             temp = temp*nums[k];
        //         }
        //         if(temp>maxMul) maxMul=temp;
        //     }
        // }
        // return maxMul;


        int maxans=0;
        int suffix=1;
        int prefix=1;
        if(n<2) return nums[0];
        for(int i=0;i<n;i++)
        {
            if(nums[i]!=0){
                prefix=prefix*nums[i];
                maxans=Math.max(maxans,prefix);
            }
            else{
                prefix=1;
            }
            if(nums[n-i-1]!=0){
                suffix=suffix*nums[n-i-1];
                maxans=Math.max(maxans,suffix);
            }
            else{
                suffix=1;
            }
        }
        return maxans;
    }
}