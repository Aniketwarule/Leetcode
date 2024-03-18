class Solution {
    public String reverseWords(String s) {
        String result = "";
		s.trim().replace(" +", " ");
		String a[] = s.trim().replaceAll("\\s+", "\s").split(" ");
		for(int i=a.length-1;i>=0;i--)
		{
			result+=a[i].trim()+" ";
		}
		return result.trim();
    }
}