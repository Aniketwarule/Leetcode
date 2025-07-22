class Solution {
    public int trap(int[] height) {
        int l=0;
        int r=height.length-1;
        int ml=0;
        int mr=0;
        int count=0;
        
        while(l<r)
        {
            if(height[l]<=height[r])
            {
                if(height[l]>=ml) ml=height[l];
                else count+=ml-height[l]; 
                l++;
            }
            else
            {
                if(height[r]>=mr) mr=height[r];
                else count+=mr-height[r];
                r--;
            }
        }
        return count;
    }
}