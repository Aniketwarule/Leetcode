class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        /*        
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
        */

        //optimal
        List<List<Integer>> list1 = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++)
        {
            if(i>0 && nums[i]==nums[i-1]) continue;
            for(int j=i+1;j<nums.length;j++)
            {
                if(j!=i+1 && nums[j]==nums[j-1]) continue;
                int k=j+1;
                int l=nums.length-1;
                while(k<l)
                {
                    long sum = nums[i];
                    sum+=nums[j];
                    sum+=nums[k];
                    sum+=nums[l];
                    if(sum==target)
                    {
                        List<Integer> temp =new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        temp.add(nums[l]);
                        list1.add(temp);
                        k++;
                        l--;
                        while(k<l && nums[k]==nums[k-1]) k++;
                        while(k<l && nums[l]==nums[l+1]) l--;
                    }
                    else if(sum<target) k++;
                    else l--;
                }
            }
        }

        return list1;
    }
}