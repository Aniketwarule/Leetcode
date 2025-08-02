class Solution {
    public int earliestFinishTime(int[] ls, int[] ld, int[] ws, int[] wd) {

        int n=ls.length;
        int m=ws.length;
        int endl = Integer.MAX_VALUE;
        int endw = Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            endl=Math.min(endl,ls[i]+ld[i]);
        }
        for(int i=0;i<m;i++)
        {
            endw=Math.min(endw,ws[i]+wd[i]);
        }

        int lf=Integer.MAX_VALUE;
        int wf=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            if(endw>=ls[i]) lf = Math.min(lf,endw+ld[i]);
            else lf = Math.min(lf,ls[i]+ld[i]);
        }
        for(int i=0;i<m;i++)
        {
            if(endl>=ws[i]) wf = Math.min(wf,endl+wd[i]);
            else wf = Math.min(wf,ws[i]+wd[i]);
        }
        return Math.min(lf,wf);
    }
}