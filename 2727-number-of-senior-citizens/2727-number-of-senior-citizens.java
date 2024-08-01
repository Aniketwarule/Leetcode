class Solution {
    public int countSeniors(String[] details) {
        int c=0;
        for(int i=0;i<details.length;i++)
        {
            String s = "";
            int a = Integer.parseInt(details[i].charAt(11)+"");
            int b = (a*10)+Integer.parseInt(details[i].charAt(12)+"");
            
            if(b>60) c++;
        }
        return c;
    }
}