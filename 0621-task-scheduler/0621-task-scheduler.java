class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] charArr = new int[26];
        for(char c : tasks){
            charArr[c - 'A']++;
        }
        int max = 0;
        int count = 0;
        for(int i : charArr) max = Math.max(max, i);
        for(int i : charArr){
            if(max == i) count++;
        }
        return Math.max(tasks.length, (n+1) * (max - 1) + count);
    }
}