class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int flag =0;
        int i=0;
        while(i<arr.length && flag<=2)
        {
            if(arr[i]%2!=0)
            {
                flag++;
            }
            else 
            {
                flag=0;
            }
            i++;
        }
        if(flag==3) return true;
        return false;
    }
}