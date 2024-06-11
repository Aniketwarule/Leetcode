class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] fr = new int[1001];
        for(int i=0;i<arr1.length;i++)
        {
            fr[arr1[i]]++;
        }
        int j=0;
        for(int i=0;i<arr2.length;i++)
        {
            while(fr[arr2[i]]!=0)
            {
                arr1[j]=arr2[i];
                fr[arr2[i]]--;
                j++;
            }
        }
        for(int i=0;i<=1000;i++)
        {
            while(fr[i]!=0)
            {
                arr1[j]=i;
                fr[i]--;
                j++;
            }
        }
        return arr1;
    }
}