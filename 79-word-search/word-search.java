class Solution {
    
    int[] dx = {-1,0,1,0};
    int[] dy = {0,1,0,-1};

    public boolean exist(char[][] board, String word) {
        int row = board.length;
        int col = board[0].length;

        for(int i = 0 ; i < row ; i++){
            for(int j = 0; j < col ; j++){

                if(board[i][j] == word.charAt(0) && find(i , j , 0 , word , board))
                return true;
            }
        }

        return false;

    }

    public boolean find(int i, int j , int ind , String word, char[][] board){
        int row = board.length;
        int col = board[0].length;

        // Base case
        if(ind == word.length()) return true;

        if(i < 0 || j < 0 || i >= row || j >= col || board[i][j] == '#' || board[i][j] != word.charAt(ind)) return false;




        // Abhi temp mai store karta hu fir vapas ane ke paas thik kar dunga
        char temp = board[i][j];
        board[i][j] ='#';


        // x,y mai ghumna hai
        for(int flow =0 ; flow < 4 ; flow++){
            int ni = i + dx[flow];
            int nj = j + dy[flow];

            if(find(ni , nj , ind+1, word, board)){
                board[i][j] = temp;
                return true;
            }
        }

        board[i][j] = temp;
        return false;
    }
}