class Solution {
    public int getWinner(int[] arr, int k) {
        int winind=0;
        int win[] =new int[arr.length];
        for(int i=1;i<arr.length;i++)
        {

            if(arr[winind]>arr[i])
            {
                win[winind]++;
            }
            else
            {
                winind=i;
                win[winind]++;
            }
            if(win[winind]>=k) return arr[winind];
        }
        return arr[winind];
    }
}