class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();

        fuck(0,0,"",res,n);
        return res;
    }

    private void fuck(int o, int c, String s, List<String> res,int n)
    {
        if(o==n && c==n)
        {
            res.add(s);
            return;
        }
        if(o<n) fuck(o+1,c,s+"(",res,n);
        if(c<o) fuck(o,c+1,s+")",res,n);
    }
}