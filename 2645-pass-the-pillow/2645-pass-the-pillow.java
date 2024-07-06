class Solution {
    public int passThePillow(int n, int time) {
        
        int p=n-1;
        int k= time/p;
        int a;
        if(k%2==0 || k==0)
        {
            a = (time%p)+1;
        }
        else{
            int b = time%p;
            a = n-b;
        }
        return a;
    }
}