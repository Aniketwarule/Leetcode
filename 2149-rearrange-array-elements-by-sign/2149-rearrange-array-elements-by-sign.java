class Solution {
    public int[] rearrangeArray(int[] nums) {

        int j=0;
        int k=0;
        int n1[] = new int[nums.length/2];
        int n2[] = new int[nums.length/2];
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>0)
            {
                n1[j]=nums[i];
                j++;
            }
            else
            {
                n2[k]=nums[i];
                k++;
            }
        }
        j=0;k=0;
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=n1[j];
            j++;
            i++;
            nums[i]=n2[k];
            k++;
        }
        return nums;
    }
}