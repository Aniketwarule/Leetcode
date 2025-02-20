class Solution {
    public String findDifferentBinaryString(String[] nums) {
        
        int n=nums.length;
        String s="";
        for(int i=0;i<n;i++)
        {
            if(nums[i].charAt(i)=='0') s=s+"1";
            else s=s+"0";
        }
        return s;
    }
}