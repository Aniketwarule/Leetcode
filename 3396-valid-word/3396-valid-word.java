class Solution {
    public boolean isValid(String word) {
        if(word.length()<3) return false;
        // else return true;
        boolean vow=false;
        boolean con=false;

        for(int i=0;i<word.length();i++)
        {
            char ch = word.charAt(i);
            if(!(ch>=48 && ch<=57) && !(ch>=65 && ch<=90) && !(ch>=97 && ch<=122)) return false;
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') vow = true;
            if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') vow = true;
            if(!(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') && (ch>=65 && ch<=90)) con = true;
            if(!(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') && (ch>=97 && ch<=122)) con =true;
        }
        if(vow && con) return true;
        else return false;
    }
}