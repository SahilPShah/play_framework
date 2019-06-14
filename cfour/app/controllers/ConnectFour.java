//
//
//public class ConnectFour{
//
//    static final int COLUMNS = 7;
//    static final int ROWS = 6;
//    static final char P1_CHAR = 'R';
//    static final char P2_CHAR = 'B';
//    private char[][] board = new char[ROWS][COLUMNS];
//    private boolean player = true;                 //true for P1 and false for P2
//    private int p1Row;
//    private int p2Row;
//    private int p1Ccl;
//    private int p2Col;
//
//    private char winner;
//
//    ConnectFour(){
//        this.init();
//    }
//
//    private void init(){
//        for(int i = 0; i < ROWS; i++){
//            for(int j = 0; j < COLUMNS; j++){
//                board[i][j] = '*';
//            }
//        }
//        winner = '*';
//    }
//
//    private boolean colFull(int col){
//        for(int i = 0; i < ROWS; i++){
//            if (board[i][col] == '*'){
//                return false;
//            }
//        }
//        return true;
//    }
//
//    public boolean boardStatus(){
//        for (int i = 0; i < COLUMNS; i++){
//            if(!this.colFull(i)) {
//                return false;
//            }
//        }
//        return true;
//    }
//
//    public int makeMove(int col){
//        if(this.colFull(col)) {
//            return -1;
//        }
//        for(int i = 1; i < ROWS; i++){
//            if(board[i][col] != '*') {
//                board[i - 1][col] = player ? P1_CHAR : P2_CHAR;
//                player ^= true;
//                return 0;
//            }
//        }
//        board[ROWS-1][col] =  player ? P1_CHAR : P2_CHAR;
//        player ^= true;
//        return 0;
//    }
//
//    public void checkWinnerVertical(){
//        for (int col = 0; col < COLUMNS; col++){
//            int count = 1;
//            for (int row = 0; row < ROWS-1; row++){
//                if (board[row][col] != '*' && board[row][col] == board[row + 1][col]) {
//                    count++;
//                } else {
//                    count = 1;
//                }
//
//                if (count >= 4) {
//                    winner = board[row][col];
//                    return;
//                }
//            }
//        }
//    }
//
//    public void checkWinnerHorz(){
//        for (int row = 0; row < ROWS; row++){
//            int count = 1;
//            for (int col = 0; col < COLUMNS - 1; col++){
//                if (board[row][col] != '*' && board[row][col] == board[row][col+1]) {
//                    count++;
//                } else {
//                    count = 1;
//                }
//
//                if (count >= 4) {
//                    winner = board[row][col];
//                    return;
//                }
//            }
//        }
//    }
//
//    public void checkWinnerUpperLeftDiag(){
//        for (int row = 0; row < 3; row++){
//            for (int col = 0; col < 4; col++){
//                char piece = board[row][col];
//                if (piece != '*' && piece == board[row+1][col+1] &&
//                        piece == board[row+2][col+2] && piece == board[row+3][col+3] ){
//                    winner = piece;
//                    return;
//                }
//            }
//        }
//    }
//
//    public void checkWinnerUpperRightDiag(){
//        for (int row = 0; row < 4; row++){
//            for (int col = COLUMNS-1; col > 2; col-- ){
//                char piece = board[row][col];
//                if (piece != '*' && piece == board[row+1][col-1] &&
//                        piece == board[row+2][col-2] && piece == board[row+3][col-3] ){
//                    winner = piece;
//                    return;
//                }
//            }
//        }
//    }
//
//    public boolean checkWinner(){
//        checkWinnerVertical();
//        checkWinnerHorz();
//        checkWinnerUpperLeftDiag();
//        checkWinnerUpperRightDiag();
//
//        if (winner == P1_CHAR){
//            System.out.println("The winner is player 1!");
//            return true;
//        }
//        else if (winner == P2_CHAR){
//            System.out.println("The winner is player 2!");
//            return true;
//        }
//
//        return false;
//    }
//
//    public void printBoard(){
//        for(int i = 0; i < ROWS; i++){
//            for(int j = 0; j < COLUMNS; j++){
//                System.out.print(board[i][j]);
//                System.out.print(" ");
//            }
//            System.out.println();
//        }
//    }
//
//
//}