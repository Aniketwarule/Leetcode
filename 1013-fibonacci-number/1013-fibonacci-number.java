class Solution {
    public int fib(int n) {
        if(n==0) return 0;
        if(n==1 || n==2) return 1;
        return fi(n);
    }
    public int fi(int n)
    {
        if(n==2||n==1) return 1;
        return fi(n-1)+fi(n-2);
    }
}