class Solution {
    public long maxKelements(int[] nums, int k) {
        PriorityQueue<Integer>pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int i=0;i<nums.length;i++)
        {
            pq.add(nums[i]);
        }
        long ans=0;
        for(int i=0;i<k;i++)
        {
            int temp = pq.poll();
            ans+=temp;
            temp = (int)Math.ceil(temp/3.0);
            pq.add(temp);
        }

        return ans;

    }
}
