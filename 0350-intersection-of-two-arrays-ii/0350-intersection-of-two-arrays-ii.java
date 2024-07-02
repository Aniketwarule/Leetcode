class Solution {
    public int[] intersect(int[] n1, int[] n2) {
        Arrays.sort(n1);
        Arrays.sort(n2);
        int i=0;
        int j=0;
        List<Integer> li = new ArrayList<Integer>(); 
        while(i<n1.length && j<n2.length)
        {
            if(n1[i]==n2[j])
            {
                li.add(n1[i]);
                i++;
                j++;
            }
            else if(n1[i]<n2[j])
            {
                i++;
            }
            else 
            {
                j++;
            }

        }
        int[] ans = new int[li.size()];
        for(int k=0;k<ans.length;k++)
        {
            ans[k]=li.get(k);
        }
        return ans;
        
    }
}