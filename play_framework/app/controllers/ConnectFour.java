public class ConnectFour{

    static final int COLUMNS = 7;
    static final int ROWS = 6;
    static final char P1_CHAR = 'R';
    static final char P2_CHAR = 'B';
    private char[][] board = new char[6][7];
    private boolean player = true;                 //true for P1 and false for P2
    private int p1Row;
    private int p2Row;
    private int p1Ccl;
    private int p2Col;

    ConnectFour(){
        this.init();
    }

    private void init(){
        for(int i = 0; i < 6; i++){
            for(int j = 0; j < 7; i++){
                board[i][j] = '*';
            }
        }
    }

    private boolean colFull(int col){
        for(int i = 0; i < ROWS; i++){
            if (board[i][col] == '*'){
                return false;
            }
        }
        return true;
    }

    public boolean boardStatus(){
        for (int i = 0; i < COLUMNS; i++){
            if(!this.colFull(i)) {
                return false;
            }
        }
        return true;
    }

    public int makeMove(int col){
        if(this.colFull(col)) {
            return -1;
        }
        for(int i = 1; i < ROWS; i++){
            if(board[i][col] != '*'){
                board[i-1][col] = player ? P1_CHAR : P2_CHAR;
                return 0;
            }
            board[ROWS-1][col] =  player ? P1_CHAR : P2_CHAR;
        }
        return 0;
    }



}