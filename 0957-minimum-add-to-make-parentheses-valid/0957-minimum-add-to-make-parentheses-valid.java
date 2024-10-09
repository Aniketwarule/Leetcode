class Solution {
    public int minAddToMakeValid(String s) {
        
        int br=0;
        int cb=0;
        int n=0;
        Stack<Character> st = new Stack<>();
        st.push(s.charAt(0));
        for(int i=1;i<s.length();i++)
        {
            if(!st.empty() && st.peek()=='(' && s.charAt(i)==')')
            {
                st.pop();
            }
            else st.push(s.charAt(i));
        }
        return st.size();
    }
}