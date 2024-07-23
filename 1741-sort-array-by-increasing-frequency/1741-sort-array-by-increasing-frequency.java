class Solution {
    public int[] frequencySort(int[] nums) {
        int freq[] = new int[201];

        for(int i=0;i<nums.length;i++)
        {
            freq[nums[i]+100]++;
        } 
        int k=0;    
        for(int i=1;i<100;i++)
        {
            int j; 
            for(j=200;j>100;j--)
            {
                if(freq[j]==i)
                {
                    while(freq[j]!=0)
                    {
                        nums[k]=j-100;
                        k++;
                        freq[j]--;
                    }
                }
            }
            for(;j>=0;j--)
            {
                if(freq[j]==i)
                {
                    while(freq[j]!=0)
                    {
                        nums[k]=-(100-j);
                        k++;
                        freq[j]--;
                    }
                }
            }
        }

        return nums;
    }
}