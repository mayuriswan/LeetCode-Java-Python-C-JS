class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        if(n==0) return false ;
        int m = matrix[0].length;
        int head = 0 , till = n*m-1;
        while(head<=till){
                int mid = head + (till-head)/2;
                int row = mid/m;
                int col = mid%m;
                if(target==matrix[row][col]) return true ; 
                if(target>matrix[row][col]){
                   head = mid +1 ;
                }else {
                    till =mid-1;
                }

        }
        return false ; 
    }
}