class Solution {
    public String longestPalindrome(String s) {
        
        String p=s.substring(0,1);
        int l=1;

        for(int i=0;i<s.length();i++)
        {
            for(int j=i+l;j<=s.length();j++)
            {
                if(isPal(s.substring(i,j)) && j-i>l)
                {
                    l=j-i;
                    p=s.substring(i,j);
                }
            }
        }
        return p;
    }
    private boolean isPal(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}