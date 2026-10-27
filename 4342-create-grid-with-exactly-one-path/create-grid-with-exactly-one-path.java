class Solution {
    public String[] createGrid(int m, int n) {
        String[]  grid = new String[m];
        char temp[][] = new char[m][n];

        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < n; j++){
                temp[i][j] = '#';
            }
        }
        // Pura row khol diya
        // for(int i = 0 ; i < n ; i++){
        //     temp[0][i] ='.';
        // }

        for(int i = 0 ; i < n ; i++){
            temp[0][i] ='.';
        }

        // pura col khol diya
        for(int i = 0; i < m ; i++){
            temp[i][n-1] = '.';
        }

        // string mai badalna padega

        for(int i = 0 ; i < m ; i++){
            grid[i] = new String(temp[i]);
        }

        return grid;

        
    }
}