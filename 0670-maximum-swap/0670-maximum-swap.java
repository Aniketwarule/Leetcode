class Solution {
    public int maximumSwap(int num) {
        
        StringBuilder s = new StringBuilder(Integer.toString(num));
        
        int prev=0;
        int pri=-1;
        int prj=-1;
        for(int i=0;i<s.length()-1;i++)
        {
            int a = Integer.parseInt(s.charAt(i)+"");
            for(int j=s.length()-1;j>i;j--)
            {
                int b = Integer.parseInt(s.charAt(j)+"");
                if(b>a) 
                {
                    if(b>prev){
                        prev = Math.max(prev,b);
                        pri=i;
                        prj=j;
                    }
                }
            }
        }
        if(prev==0)
        {
            return num;
        }
        else 
        {
            char ch = s.charAt(pri);
            s.replace(pri,pri+1,s.charAt(prj)+"");
            s.replace(prj,prj+1,ch+"");
            return Integer.parseInt(s.toString());
        }
    }
}