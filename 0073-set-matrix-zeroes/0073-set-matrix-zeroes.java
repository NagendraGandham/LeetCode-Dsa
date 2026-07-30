class Solution {
    public void setZeroes(int[][] matrix) {
        if(matrix.length<1){
            return;
        }
        int[] rows=new int[matrix.length];
        int[] column=new int[matrix[0].length];

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    rows[i]=1;
                    column[j]=1;
                }
            }
        }

        for(int i=0;i<rows.length;i++){
            for(int j=0;j<column.length;j++){
                if(rows[i]==1){
                    matrix[i][j]=0;
                }
            }
        }

        for(int j=0;j<column.length;j++){
            for(int i=0;i<rows.length;i++){
                if(column[j]==1){
                    matrix[i][j]=0;
                }
            }
        }
    }
}