class Solution {
    public int minLength(String s) {
        
        StringBuilder st = new StringBuilder(s);
        int size=st.length();
        for(int i=0;i<size/2;i++)
        {
            for(int j=0;j<st.length()-1;j++)
            {
                if((st.charAt(j)=='A' && st.charAt(j+1)=='B') ||(st.charAt(j)=='C' && st.charAt(j+1)=='D'))
                {
                    st.delete(j,j+2);
                }
            }
        }
        return st.length();
    }
}