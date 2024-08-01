class Solution {
    public int countSeniors(String[] details) {
        int c=0;
        for(int i=0;i<details.length;i++)
        {
            String s = "";
            int a = details[i].charAt(11)-'0';
            int b = (a*10)+(details[i].charAt(12)-'0');
            
            if(b>60) c++;
        }
        return c;
    }
}