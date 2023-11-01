class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        
        Set<List<Integer>> list = new HashSet<>();

        for(int i=0;i<nums.length-2;i++)
        {
            for(int j=i+1;j<nums.length-1;j++)
            {
                Set<Long> hashset = new HashSet<>();
                for(int k=j+1;k<nums.length;k++)
                {
                    long sum=nums[i]+nums[j];
                    sum+=nums[k];
                    long fourth= target-(sum);

                    if (hashset.contains(fourth)) {
                        List<Integer> temp = Arrays.asList(nums[i],nums[j],nums[k],(int)fourth);
                        temp.sort(null);
                        list.add(temp);
                    }
                    hashset.add((long)nums[k]);
                }
            }
        }
        List<List<Integer>> list1 = new ArrayList<>(list);
        return list1;
    }
}