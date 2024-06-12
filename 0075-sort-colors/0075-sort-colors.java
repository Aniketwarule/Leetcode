class Solution {
    public void sortColors(int[] nums) {
        
        int a=0;
        int b=nums.length-1;
        int i=0;
        while(a<=b && i<=b)
        {
            if(nums[i]==0 && i!=a)
            {
                nums[i]=nums[a];
                nums[a]=0;
                a++;
            }
            else if(b>i && nums[i]==2)
            {
                nums[i]=nums[b];
                nums[b]=2;
                b--;
            }
            else{
                i++;
            }
        }
    }
}