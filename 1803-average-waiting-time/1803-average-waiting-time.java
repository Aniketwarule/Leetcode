class Solution {
    public double averageWaitingTime(int[][] cus) {
        
        int timer = cus[0][0];
        double alltime=0;
        for(int i=0;i<cus.length;i++)
        {
            timer+=cus[i][1];
            timer = Math.max(timer,cus[i][0]+cus[i][1]);
            alltime+=timer-cus[i][0];
        }
        return alltime/cus.length;
    }
}