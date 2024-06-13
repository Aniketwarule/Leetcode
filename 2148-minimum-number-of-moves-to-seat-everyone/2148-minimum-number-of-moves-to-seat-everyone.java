class Solution {
    public int minMovesToSeat(int[] seats, int[] stud) {
        Arrays.sort(seats);
        Arrays.sort(stud);
        int cnt=0;
        for(int i=0;i<stud.length;i++)
        {
            cnt+=Math.abs(seats[i]-stud[i]);
        }
        return cnt;
    }
}