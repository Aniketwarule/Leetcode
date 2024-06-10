class Solution {
    public int heightChecker(int[] h) {
        int[] h2 = h.clone();
        Arrays.sort(h);
        int c=0;
        for(int i=0;i<h.length;i++)
        {
            if(h[i]!=h2[i]) c++;
        }
        return c;
    }
}