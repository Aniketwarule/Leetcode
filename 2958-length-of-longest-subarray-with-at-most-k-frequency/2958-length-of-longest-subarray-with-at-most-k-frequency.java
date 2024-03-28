class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer, Integer> freq = new HashMap<Integer, Integer>();
        int left =0, right =0, maxlen = 0;

        while(right < nums.length){
            freq.put(nums[right], freq.getOrDefault(nums[right], 0) + 1);

            while(freq.get(nums[right]) > k){
                freq.put(nums[left], freq.getOrDefault(nums[left], 0) - 1);
                left++;
            }

            maxlen = Math.max(maxlen, right - left + 1);
            right++;
        }
        
        return maxlen;
    }
}