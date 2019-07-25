// N-Queen
// N*N chess board, postions of queens are given. 

// input: N
// [0/1]

bool solveNQueenUtil(int[][] chessboard, int C, int N) {
    if(C >= N) {

    }
}


bool isValidNQueen(int[][] array, int N) {
    int[][] chessboard = new int[N][N];
    for(int i=0; i<N; i++) {
         for(int j=0; j<N; j++) {
             chessboard[i][j] = 0;
         }
    }
    if(solveNQueenUtil(chessboard, 0, N) == false) {
        return false; // No solution exists, irrespective of input
    }
    return compareArrays(array, chessboard);
}


1 0 0 0 
0 0 1 0
0 0 0 1
0 1 0 0

// it can move till the end.

bool isValid(int[][] chessboard, int N) {
    int[] xCor = {0, 0, 1, 1, 1, -1, -1, -1};
    int[] yCor = {1, -1, 0, -1, 1, 0, 1, -1 };
    bool isvalid = true;
    for(int i=0; i<N; i++) {
        for(int j = 0; j<N; j++) {
            for(int k=0; k<8; k++) {
                int x = i + xCor[k];
                int y = j + yCor[k];
                if(x < N && y < N  && x >= 0 y >= 0 && (chessboard[x][y] == chessboard[i][j]) && chessboard[i][j]==1) {
                    isValid = false;
                }
            }
        }
    }
    return isValid;
}

