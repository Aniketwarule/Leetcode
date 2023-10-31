class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list=new ArrayList<Integer>();

        int cnt1=0;
        int cnt2=0;
        int e1=Integer.MIN_VALUE;;
        int e2=Integer.MIN_VALUE;;

        for(int i=0;i<nums.length;i++)
        {
            if(cnt1==0 && nums[i]!=e2)
            {
                cnt1=1;
                e1=nums[i];
            }
            else if(cnt2==0 && nums[i]!=e1)
            {
                cnt2=1;
                e2=nums[i];
            }
            else if(nums[i]==e1) cnt1++;
            else if(nums[i]==e2) cnt2++;
            else 
            {
                cnt1--;
                cnt2--;
            }
        }

        cnt1 = 0; cnt2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == e1) cnt1++;
            if (nums[i] == e2) cnt2++;
        }

        //int mini = (int)(nums.length / 3) + 1;
        if (cnt1 >= (nums.length / 3) + 1) list.add(e1);
        if (cnt2 >= (nums.length / 3) + 1) list.add(e2);
        return list;
    }
}