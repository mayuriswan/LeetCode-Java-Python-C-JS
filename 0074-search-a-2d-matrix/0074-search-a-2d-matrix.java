class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        if (n == 0) return false; // Handle edge case of empty matrix
        int m = matrix[0].length;
        
        int head = 0, till = n * m - 1;
        
        while (head <= till) {
            int mid = head + (till - head) / 2;
            int row = mid / m;
            int col = mid % m;
            
            if (matrix[row][col] == target) {
                return true;
            } else if (matrix[row][col] < target) {
                head = mid + 1;
            } else {
                till = mid - 1;
            }
        }
        return false;
    }
}