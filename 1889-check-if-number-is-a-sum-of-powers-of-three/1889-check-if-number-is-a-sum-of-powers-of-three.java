class Solution {
    public boolean checkPowersOfThree(int n) {
        
        while(n>1)
        {
            if(n%3==2) return false;
            n=n/3;
        }
        return true;
    }
}