class Solution {
    public int maxScore(String s) {
        int n=s.length();
        int mx=0;
        for(int i=0;i<n-1;i++)
        {
            int t=0;
            char[] ch;
            ch=s.substring(0,i+1).toCharArray();
            for(int j=0;j<=i;j++)
            {
                if(ch[j]=='0') t++;
            }
            ch=s.substring(i+1).toCharArray();
            for(int j=0;j<n-i-1;j++)
            {
                if(ch[j]=='1') t++;
            }
            if(t>mx) mx=t;
        }
        return mx;
    }
}