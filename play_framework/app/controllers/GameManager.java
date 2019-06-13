
import java.util.Random;
public class GameManager{
    public static void main(String [] args){
        Random rng = new Random();
        ConnectFour c4 = new ConnectFour();
        c4.printBoard();
        int i = 0;
        c4.makeMove(0);
        c4.makeMove(0);
        c4.makeMove(0);
        c4.makeMove(0);
        c4.makeMove(0);
        c4.makeMove(0);

        c4.makeMove(1);
        c4.makeMove(1);
        c4.makeMove(1);
        c4.makeMove(1);
        c4.makeMove(1);
        c4.makeMove(1);

        c4.makeMove(2);
        c4.makeMove(2);
        c4.makeMove(2);
        c4.makeMove(2);
        c4.makeMove(2);
        c4.makeMove(2);

        c4.makeMove(3);
        c4.makeMove(3);
        c4.makeMove(3);
        c4.makeMove(3);
        c4.makeMove(3);
        c4.makeMove(3);

        c4.makeMove(4);
        c4.makeMove(4);
        c4.makeMove(4);
        c4.makeMove(4);
        c4.makeMove(4);
        c4.makeMove(4);

        c4.makeMove(5);
        c4.makeMove(5);
        c4.makeMove(5);
        c4.makeMove(5);
        c4.makeMove(5);
        c4.makeMove(5);

        c4.makeMove(6);
        c4.makeMove(6);
        c4.makeMove(6);
        c4.makeMove(6);
        c4.makeMove(6);
        c4.makeMove(6);

        c4.makeMove(1);
        c4.makeMove(2);
        c4.makeMove(3);
        c4.makeMove(4);
        c4.makeMove(5);
        c4.makeMove(6);
        int j = c4.makeMove(0);
        c4.printBoard();
        System.out.println(j);
    }
}