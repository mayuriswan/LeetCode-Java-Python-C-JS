class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> set = new HashSet();
        for(int i =0 ; i<9 ; i++){
            for(int j = 0 ; j<9 ; j++){
                char cur = board[i][j];
                if(cur!='.'){
                    if(!set.add(cur+"found in row "+i)
                || !set.add(cur+"found in column "+j )
                || !set.add(cur+"found in box"+i/3+"-"+j/3))return false;
                }
            }
        }
        return true ;
    }
}