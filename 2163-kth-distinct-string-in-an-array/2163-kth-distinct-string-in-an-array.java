class Solution {
    public String kthDistinct(String[] arr, int k) {
        
        HashMap<String,Integer> h= new HashMap<String,Integer>();

        for(int i=0;i<arr.length;i++)
        {
            h.put(arr[i],h.getOrDefault(arr[i],0)+1);
        }

        for(String v : arr)
        {    
            if(h.get(v)==1)
            {
                k--;
                if(k==0) return v;
            }
        }
        return "";
    }
}