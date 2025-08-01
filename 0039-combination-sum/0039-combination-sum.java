class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();

        back(candidates, target, 0, res, new ArrayList<>());
        return res;
    }  
    public void back(int[] arr,int tar,int idx, List<List<Integer>> res, List<Integer> ds)
    {
        if(idx==arr.length)
        {
            if(tar==0) res.add(new ArrayList<>(ds));
            return;
        }
        if(arr[idx]<=tar)
        {
            ds.add(arr[idx]);
            back(arr, tar-arr[idx], idx, res, ds);
            ds.remove(ds.size()-1);
        }
        back(arr, tar, idx+1, res, ds);
    }
}