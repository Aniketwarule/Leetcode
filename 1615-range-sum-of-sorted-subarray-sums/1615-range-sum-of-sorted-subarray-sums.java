class Solution {

    public int rangeSum(int[] nums, int n, int left, int right) {
        int sum=0;
        ArrayList<Integer> ne = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            sum=0;
            for(int j=i;j<n;j++)
            {
                sum+=nums[j];
                ne.add(sum);
            }
        }
        Collections.sort(ne);   
        int ans=0;
        final int mod = (int) 1e9 + 7;
        for(int i=left;i<=right;i++)
        {
            ans=(ans+ne.get(i-1))%mod;
        }
        return ans;
    }
}