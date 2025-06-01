import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    Board board = new Board();
    Dice dice = new Dice();
    private String nameChoice;
    private String charChoice;
    private String[] characterChoices = {"@", "%", "&", "*"}; // random list of preset characters you can use (fully customizable!!)
    Scanner input = new Scanner(System.in);
    private Player[] playerList = {}; // stores the 4 player objects
    boolean contains; // used to check if
    private int diceRoll;   // used to store dice roll to be able to print it
    Scanner deadInput = new Scanner(System.in);   // used to make rolls a bit more interactive

    public void main(String[] args) {
    }
    public void startSequence(){
        System.out.println("Welcome to Animopoly!");
        Player Player1 = new Player(nameChoice, charChoice, 0, 1000);
        playerList[0] = Player1;
        Player Player2 = new Player(nameChoice, charChoice, 0, 1000);
        playerList[1] = Player2;
        Player Player3 = new Player(nameChoice, charChoice, 0, 1000);
        playerList[2] = Player3;
        Player Player4 = new Player(nameChoice, charChoice, 0, 1000);
        playerList[3] = Player4;
    }
    public void inputSequence(int playerNumber) {
        System.out.println("Player " + playerNumber + ", please enter your name: \n");
        nameChoice = input.nextLine();
        do {
            System.out.println("Player " + playerNumber + ", please select one of these characters: \n");
            charChoice = String.valueOf(input.next().charAt(0));
        }while(contains == Arrays.asList(characterChoices).contains(charChoice));
    }
    private void turn(){
        do{
            for(int i = 0; i < 4; i++) {
                if(playerList[i].getMoney() > 0);{
                    board.displayBoard();
                    System.out.println("It is " + playerList[i].getName() + "'s turn!" );
                    System.out.println("Press enter to roll!");
                    deadInput.nextInt();
                    diceRoll = dice.Roll();
                    System.out.println("You rolled " + diceRoll + "!");

                }

            }


        }while(board.checkWinner(playerList) == 0);
    }
}