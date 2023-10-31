class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list=new ArrayList<Integer>();
        Arrays.sort(nums);
        if(nums.length<2)
        {
            list.add(nums[0]);
            return list;
        }
        if(nums.length<3)
        {
            if(nums[0]==nums[1])
            {
                list.add(nums[0]);
            }
            else
            {
                list.add(nums[0]);
                list.add(nums[1]);
            }
            return list;
        }
        int c=1;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i-1]==nums[i])
            {
                c++;
                if(c>nums.length/3)
                {
                    if(c<=(nums.length/3)+1) list.add(nums[i]);
                }
            }
            else
            {
                c=1;
            }
        }
        return list;
    }
}