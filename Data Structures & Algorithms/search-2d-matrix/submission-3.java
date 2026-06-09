class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int left = 0;
        int right = matrix.length*matrix[0].length - 1;
        while(left<=right){
            int mid = (right+left)/2 ;
            int l = mid/(matrix[0].length);
            int r = (mid)%(matrix[0].length);
            if(matrix[l][r]==target){
                return true;
            }
            else if(matrix[l][r]>target){
                right = mid-1 ;
            }
            else{
                left = mid+1 ;
            }
        }
        return false;
    }
}
