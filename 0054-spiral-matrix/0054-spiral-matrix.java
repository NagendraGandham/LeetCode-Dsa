class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int top=0;
        int bottom=matrix.length-1;
        int left=0;
        int right=matrix[0].length-1;
        List<Integer> list=new ArrayList<>();
        while(left<=right && top<=bottom){
            int temp=left;
            while(temp<=right){
                list.add(matrix[top][temp]);
                temp++;
            }
            temp=++top;
            while(temp<=bottom){
                list.add(matrix[temp][right]);
                temp++;
            }
            temp=--right;
            while(top<=bottom && temp>=left){
                list.add(matrix[bottom][temp]);
                temp--;
            }
            temp=--bottom;
            while(left<=right && temp>=top){
                list.add(matrix[temp][left]);
                temp--;
            }
            left++;
        }
        return list;
    }
}