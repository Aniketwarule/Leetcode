class Solution {
    public int maxAbsoluteSum(int[] nums) {
        return Math.max(kadane(nums),Math.abs(rkadane(nums)));
    }
    public int kadane(int[] ar)
    {
        int sum=0;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<ar.length;i++)
        {
            sum+=ar[i];
            if(sum>max) max =sum;
            if(sum<0) sum=0;
        }
        return max;
    }
    public int rkadane(int[] ar)
    {
        int sum=0;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<ar.length;i++)
        {
            sum+=ar[i];
            if(sum<min) min=sum;
            if(sum>0) sum=0;
        }
        return min;
    }
}