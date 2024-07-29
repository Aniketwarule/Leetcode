class Solution {
    public int numTeams(int[] r) {
        int n=r.length;

        int c=0;
        for(int i=0;i<n-2;i++)
        {
            for(int j=i+1;j<n-1;j++)
            {
                for(int k=j+1;k<n;k++)
                {
                    if(r[i]<r[j] && r[j]<r[k]) c++;
                    if(r[i]>r[j] && r[j]>r[k]) c++;
                }
            }
        }
        return c;
    }
}