class Solution {
    public String reverseParentheses(String s) {
        
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==')')
            {
                String temp="";
                char t = st.pop();
                while(t!='(')
                {
                    temp= temp+t;
                    t = st.pop();
                }

                for(int j=0;j<temp.length();j++)
                {
                    st.push(temp.charAt(j));
                }
            }
            else st.push(s.charAt(i));
        }

        String ans="";
        while(!st.isEmpty())
        {
            ans = st.pop()+ans;
        }
        return ans;
    }
}