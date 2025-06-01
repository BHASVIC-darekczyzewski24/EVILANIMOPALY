import java.io.Console;
import java.util.Arrays;
import java.util.Scanner;

public class Board
{
    private String[] board;  // used to display board


    public int checkWinner(Player[] playerList){
        int playersIn = 0;
        int winner = 0;
        for(int i = 0; i < 4; i++) { // cycles through all the players and checks for # of players still in

            if (playerList[i].getMoney() > 0) {
                playersIn += 1;
                winner = i;
            }
        }
        if (playersIn > 1){ // if theres more than 1 player return 0 and carry on the turn loop
            return 0;
        }
        else {
            return winner; // if theres 1 player left return player number
        }
    }
    public void displayBoard(){
        // emptying the array
        board = null;
        // adding all the player's rep to their location on the board
        for(int i = 0; i < 5; i++) {

        }
        // filling the rest of the array with the correct space numbers and skipping
        for(int j = 0; j < 26; j++){
            if(board[j] == null) {
                board[j] = String.valueOf(j + 1);
            }
        }
        // going through the board array and printing the contents
        for(int x = 0; x < 26; x++){
            System.out.println("[" + board[x] + "]");
        }

    }
}
