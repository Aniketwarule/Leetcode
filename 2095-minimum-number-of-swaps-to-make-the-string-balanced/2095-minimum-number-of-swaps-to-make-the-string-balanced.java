class Solution {
    public int minSwaps(String s) {
        
        int ob= 0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='[') ob++;
            else if(ob>0) ob--;
        }
        return (ob+1)/2;
    }
}