import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class StartGame {
    private final int width = 10;
    private final int height  = 10;
    private boolean game = true;
    private final int[][] boardGame = new int[width][height];
    private Players player1, playerComp, playerApple;

    Messages messages = new Messages();
    Move move = new Move();
    RandomMachine randomMachine = new RandomMachine();
    GameStatus gameStatus = new GameStatus();
    BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

    StartGame() throws IOException {
        fillBoard();
        createPlayers();
        System.out.println(messages.getInfo(0));
        while(game) startGame();
    }
    void fillBoard() {
        for (int a = 0; a < boardGame.length; a++) {
            Arrays.fill(boardGame[a], 0);
        }
    }
    void printBoard() {
        for (int[] ints : boardGame) {
            for (int anInt : ints) {
                if (anInt == 1) System.out.print("|X|\t");
                else if (anInt == 2) System.out.print("|E|\t");
                else if (anInt == 3) System.out.print("|A|\t");
                else System.out.print("| |\t");
            }
            System.out.println();
        }
    }
    void createPlayers() {
        player1 = new Players(randomMachine.returnRandomPos(width),
                randomMachine.returnRandomPos(width) );
        boardGame[player1.getPlayersY()][player1.getPlayersX()] = 1;

        playerComp = new Players(randomMachine.returnRandomPos(width),
                randomMachine.returnRandomPos(width) );
        boardGame[playerComp.getPlayersY()][playerComp.getPlayersX()] = 2;

        playerApple = new Players(randomMachine.returnRandomPos(width),
                randomMachine.returnRandomPos(width));
        boardGame[playerApple.getPlayersY()][playerApple.getPlayersX()] = 3;
    }
    void startGame() throws IOException {
        printBoard();
        System.out.println(messages.getInfo(1));
        move.setMove(read.readLine().toLowerCase());
        cleanMove();
        move.changeMove(player1);
        game = checkGame();
        move.compPlayerMove(playerComp, player1);
        game = checkGame();
        moveManager();

    }
    void cleanMove() {
        boardGame[player1.getPlayersY()][player1.getPlayersX()] = 0;
        boardGame[playerComp.getPlayersY()][playerComp.getPlayersX()] = 0;
    }
    void moveManager() {
        boardGame[player1.getPlayersY()][player1.getPlayersX()] = 1;
        boardGame[playerComp.getPlayersY()][playerComp.getPlayersX()] = 2;
    }
    boolean checkGame() {
        int status = gameStatus.checkGame(player1, playerComp, playerApple);
        if(status == 1) {
            boardGame[playerApple.getPlayersY()][playerApple.getPlayersX()] = 0;
            boardGame[randomMachine.returnRandomPos(width)][randomMachine.returnRandomPos(width)] = 3;
            System.out.println(messages.getInfo(2));
        } else if (status == 2) {
            cleanMove();
            boardGame[randomMachine.returnRandomPos(width)][randomMachine.returnRandomPos(width)] = 1;
            boardGame[randomMachine.returnRandomPos(width)][randomMachine.returnRandomPos(width)] = 2;
            System.out.println(messages.getInfo(3));
            return false;
        }
        return true;
    }
}
