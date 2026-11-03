class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> set = new HashSet<>();
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                char c = board[i][j];
                if(c=='.'){
                    continue;
                }
                String row = c+ "in row" + i ;
                String column = c+ "in column" + j;
                String box = c + "in box" + (i/3) + (j/3);
                if(set.contains(row) || set.contains(column) || set.contains(box)){
                    return false;
                }
                set.add(row);
                set.add(column);
                set.add(box);
            }

        }
            return true;
        }
    
}