class Solution {
    public long minimumSteps(String s) {
        long ans = 0;
        int a = 0; 
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') 
                ans += (long) a; 
            else
                a++; 
        }
        return ans;
    }
}