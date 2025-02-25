class Solution {
    public int numOfSubarrays(int[] arr) {
        int prefixSum = 0;
        long oddCount = 0;
        int m = 1000000007;

        for(int i : arr){
            prefixSum = (prefixSum + i) % m;

            if(prefixSum % 2 == 1){
                oddCount++;
            }
        }

        oddCount += ((arr.length - oddCount) * oddCount);        

        return (int)(oddCount % m);
    }
}