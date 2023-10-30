class Solution {
    public void rotate(int[][] matrix) {
        int m[][]= new int[matrix.length][matrix.length];
        int ind=0;
        int ind2=matrix.length-1;
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix.length;j++)
            {
                m[j][ind2]=matrix[ind][j];
            }
            ind++;
            ind2--;
        }
        
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix.length;j++)
            {
                matrix[i][j]=m[i][j];
            }
        }
    }
}