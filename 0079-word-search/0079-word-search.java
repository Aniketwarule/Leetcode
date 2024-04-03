class Solution {
    public boolean exist(char[][] board, String word) {
        for(int i =0;i<board.length; i++){
            for (int j=0; j<board[0].length; j++){
                if(board[i][j] == word.charAt(0)){
                    boolean found = found(board, word, i, j, 0);
                    if(found) return true;
                }
            }
        }
        return false;
    }
    boolean found(char [][] board, String word, int row, int col, int wordIndex)
    {
        int m = board.length, n = board[0].length;
        if(word.length() ==wordIndex) return true;
        if(row <0 || row >=m || col >= n || col <0 ) return false;
        if( word.charAt(wordIndex) != board[row][col] || board[row][col]==' ' ) return false;

        char ch = board[row][col];
       
        if(board[row][col] == word.charAt(wordIndex)) 
        {
            board[row][col]= ' ';
        }
        if(
        found(board,  word,  row+1,  col,  wordIndex+1) ||
        found(board,  word,  row-1,  col,  wordIndex+1) ||
        found(board,  word,  row,  col+1,  wordIndex+1) ||
        found(board,  word,  row,  col-1,  wordIndex+1)  
        ) return true;

        board[row][col] =ch;
        return false;
    }
}