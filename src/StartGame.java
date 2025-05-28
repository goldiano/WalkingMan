import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class StartGame {
   
    private boolean game = true;
    private boolean gameRestart = true;
    private final int numberSize = 10;
    private Players player1, playerComp, playerApple;

    Messages messages = new Messages();
    Move move = new Move();
    RandomMachine randomMachine = new RandomMachine();
    GameStatus gameStatus = new GameStatus();
    BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
    Board board = new Board();

    StartGame() throws IOException {
        createPlayers();
        System.out.println(messages.getInfo(0));
        while(game) startGame();
    }
    
    void createPlayers() {
        player1 = createRandomPlayer();
        playerComp = createRandomPlayer();
        playerApple = createRandomPlayer();
    }

    private Players createRandomPlayer() {
        return new Players(randomMachine.returnRandomPos(numberSize),
                           randomMachine.returnRandomPos(numberSize));
    }
    void startGame() throws IOException {
        if(gameRestart) board.cleanBoard();
        
        board.printBoard();
        System.out.println(messages.getInfo(1));
        move.setMove(read.readLine().toLowerCase());
        board.cleanMove();
        move.changeMove(player1);
        move.compPlayerMove(playerComp, player1);

        
    
    }
    
}
