class Solution {
    public int[][] merge(int[][] intervals) {
        int n = intervals.length;
        Arrays.sort(intervals, Comparator.comparingInt((int[] arr) -> arr[0]).thenComparingInt(arr -> arr[1]));

        List<List<Integer>> ans = new ArrayList<>();
        
        int fro=intervals[0][0];
        int back=intervals[0][1];
        for(int i=0;i<n;i++)
        {
            if (ans.isEmpty() || intervals[i][0] > ans.get(ans.size() - 1).get(1)) ans.add(Arrays.asList(intervals[i][0], intervals[i][1]));
            else ans.get(ans.size()-1).set(1,Math.max(ans.get(ans.size()-1).get(1),intervals[i][1]));
        }
        int[][] array = new int[ans.size()][ans.get(0).size()];
        for (int i = 0; i < ans.size(); i++) 
        {
            for (int j = 0; j < ans.get(i).size(); j++) 
            {
                array[i][j] = ans.get(i).get(j);
            }
        }
        return array;
    }
}