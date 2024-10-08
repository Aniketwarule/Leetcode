class Solution {
    public int minSwaps(String s) {
        
        StringBuilder st = new StringBuilder(s);
        int ob= 0;
        int cb= 0;
        int c=0;
        for(int i=0;i<s.length();i++)
        {
            if(st.charAt(i)=='[') ob++;
            else if(ob>0) ob--;
        }
        return (ob+1)/2;
    }
}