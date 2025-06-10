class Solution {
    public int maxDifference(String s) {
        int[] arr = new int[26];
        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            arr[c-'a']++;
        }
        int ma=0;
        int mi=101;
        for(int i=0;i<26;i++)
        {
            if(arr[i]%2==1) ma = Math.max(ma,arr[i]);
            else if(arr[i]!=0) mi = Math.min(mi,arr[i]);
        }
        return ma-mi;
    }
}