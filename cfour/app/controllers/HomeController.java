package controllers;

import com.sun.net.httpserver.HttpContext;
import java.util.List;
import com.fasterxml.jackson.databind.JsonNode;
import play.mvc.*;
import views.html.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */

    ConnectFour c4;

    public Result index() {
        return ok(views.html.index.render());
    }

    public Result connectFour(){
        c4 = new ConnectFour();

        return ok(connectFour.render("CONNECT FOUR MAIN"));
    }

    public Result connectFourReset(){
        return ok(connectFour.render("SHOW NEW BOARD"));
    }

    public Result connectFourUpdate(Http.Request request){
        JsonNode json = request.body().asJson();
        int col = json.get("col").asInt();


        c4.makeMove(col);

        return ok("{\"col\":  0}");
    }

}

class ConnectFour{

    static final int COLUMNS = 7;
    static final int ROWS = 6;
    static final char P1_CHAR = 'R';
    static final char P2_CHAR = 'B';
    private char[][] board = new char[ROWS][COLUMNS];
    private boolean player = true;                 //true for P1 and false for P2
    private int recentRow;

    private char winner;

    ConnectFour(){
        this.init();
    }

    private void init(){
        for(int i = 0; i < ROWS; i++){
            for(int j = 0; j < COLUMNS; j++){
                board[i][j] = '*';
            }
        }
        winner = '*';
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

    public String makeMove(int col){
        System.out.println(col);
        if(this.colFull(col)) {
            return "{}";
        }
        for(int i = 1; i < ROWS; i++){
            if(board[i][col] != '*') {
                board[i - 1][col] = player ? P1_CHAR : P2_CHAR;
                player ^= true;
                recentRow = i-1;
                return "{\n" +
                        "  \"col\" : col,\n" +
                        "  \"row\": row,\n" +
                        "  \"player\": player\n" +
                        "}";
            }
        }
        board[ROWS-1][col] =  player ? P1_CHAR : P2_CHAR;
        player ^= true;

        recentRow = ROWS-1;
        String ret = "{\n" +
                "  \"col\" : col,\n" +
                "  \"row\": row,\n" +
                "  \"player\": player\n" +
                "}";
        return ret;
    }

    public void checkWinnerVertical(){
        for (int col = 0; col < COLUMNS; col++){
            int count = 1;
            for (int row = 0; row < ROWS-1; row++){
                if (board[row][col] != '*' && board[row][col] == board[row + 1][col]) {
                    count++;
                } else {
                    count = 1;
                }

                if (count >= 4) {
                    winner = board[row][col];
                    return;
                }
            }
        }
    }

    public void checkWinnerHorz(){
        for (int row = 0; row < ROWS; row++){
            int count = 1;
            for (int col = 0; col < COLUMNS - 1; col++){
                if (board[row][col] != '*' && board[row][col] == board[row][col+1]) {
                    count++;
                } else {
                    count = 1;
                }

                if (count >= 4) {
                    winner = board[row][col];
                    return;
                }
            }
        }
    }

    public void checkWinnerUpperLeftDiag(){
        for (int row = 0; row < 3; row++){
            for (int col = 0; col < 4; col++){
                char piece = board[row][col];
                if (piece != '*' && piece == board[row+1][col+1] &&
                        piece == board[row+2][col+2] && piece == board[row+3][col+3] ){
                    winner = piece;
                    return;
                }
            }
        }
    }

    public void checkWinnerUpperRightDiag(){
        for (int row = 0; row < 4; row++){
            for (int col = COLUMNS-1; col > 2; col-- ){
                char piece = board[row][col];
                if (piece != '*' && piece == board[row+1][col-1] &&
                        piece == board[row+2][col-2] && piece == board[row+3][col-3] ){
                    winner = piece;
                    return;
                }
            }
        }
    }

    public boolean checkWinner(){
        checkWinnerVertical();
        checkWinnerHorz();
        checkWinnerUpperLeftDiag();
        checkWinnerUpperRightDiag();

        if (winner == P1_CHAR){
            System.out.println("The winner is player 1!");
            return true;
        }
        else if (winner == P2_CHAR){
            System.out.println("The winner is player 2!");
            return true;
        }

        return false;
    }

    public void printBoard(){
        for(int i = 0; i < ROWS; i++){
            for(int j = 0; j < COLUMNS; j++){
                System.out.print(board[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
