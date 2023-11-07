class Solution {
    public int eliminateMaximum(int[] dist, int[] speed) {
        double reach[] = new double[dist.length];
        for(int i=0;i<dist.length;i++)
        {
            reach[i]=(double)dist[i]/speed[i];
        }
        Arrays.sort(reach);
        for(int i=1;i<dist.length;i++)
        {
            if(reach[i]<=i) return i;
        }
        return dist.length;
    }
}