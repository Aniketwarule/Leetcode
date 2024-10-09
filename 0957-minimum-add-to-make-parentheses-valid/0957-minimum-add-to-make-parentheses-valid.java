class Solution {
    public int minAddToMakeValid(String s) {
        
        int br=0;
        int cb=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(') br++;
            else
            {
                if(br>0) br--;
                else cb++; 
            }
        }
        return cb+br;
    }
}