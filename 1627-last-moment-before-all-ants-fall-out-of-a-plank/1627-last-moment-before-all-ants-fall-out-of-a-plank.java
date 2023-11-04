class Solution {
    public int getLastMoment(int n, int[] left, int[] right) {
        int ma=0;
        for(int i=0;i<left.length;i++) ma=Math.max(ma,left[i]);
        for(int i=0;i<right.length;i++) ma=Math.max(ma,n-right[i]);
        return ma;
    }
}