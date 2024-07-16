// class Solution {
//     public int myAtoi(String s1) {
//         String s = s1.strip();
//         int neg=1;
//         if(s.charAt(0)=='-') neg = -1;

//         return myfun(s.strip(),0,0,neg)*neg;
//     }
//     public int myfun(String s,int i,int cur,int neg)
//     {
//         char c = s.charAt(i);
//         int asc = c-'0';
//         if((asc>=0 && asc<=9))
//         {
//             int temp=0;
//             cur=cur+asc;
//             if(i<s.length()-1) temp = myfun(s,i+1,cur*10,neg);
//             int fina = Math.max(temp,cur);
//             if (fina * neg > Integer.MAX_VALUE) return Integer.MAX_VALUE;
//             if (fina * neg < Integer.MIN_VALUE) return Integer.MIN_VALUE;
//             return asc;
//         }
//         else if(neg==-1) 
//         {
//             return myfun(s.strip(),-1,0,neg);
//         }
//         return 0;
//     }
// }

class Solution {
    public int myAtoi(String s) {
        s = s.trim(); // Remove leading and trailing whitespace
        if (s.isEmpty()) return 0; // Return 0 if the string is empty after trimming
        return atoiRecursive(s, 0, 1, 0); // Call the recursive helper function
    }

    public int atoiRecursive(String s, int idx, int sign, long res) {
        if (idx == s.length()) return (int) (sign * res); // Base case: return the final result
        
        char c = s.charAt(idx); // Get the character at index idx
        
        if (Character.isDigit(c)) {
            // If the character is a digit, update the result
            res = (res * 10) + (c - '0');
            
            // Check for overflow/underflow
            if (res * sign > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if (res * sign < Integer.MIN_VALUE) return Integer.MIN_VALUE;
            
            // Continue recursively with the next character
            return atoiRecursive(s, idx + 1, sign, res);
        } else if (idx == 0 && (c == '+' || c == '-')) {
            // If the character is '+' or '-' and it's the first character, update the sign
            if (c == '-') sign = -1;
            
            // Continue recursively with the next character
            return atoiRecursive(s, idx + 1, sign, res);
        }
        
        // If the character is not a digit and it's not the first character,
        // or if it's an invalid character, return the current result
        return (int) (sign * res);
    }
}