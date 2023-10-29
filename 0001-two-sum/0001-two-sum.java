class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        if(nums == null || nums.length == 0){
            return res;
        }

        Map<Integer, Integer> map = new HashMap<>();
        for(int index=0;index<nums.length;index++){
            if(map.containsKey(target-nums[index])){
                res[0] = map.get(target-nums[index]);
                res[1] = index;
                break;
            }
            map.put(nums[index], index);
        }
        return res;
    }
}