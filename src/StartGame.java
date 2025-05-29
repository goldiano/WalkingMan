import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StartGame {

    private boolean game = true;
    private boolean gameRestart = true;
    private final int numberSize = 10;
    private Players player1, playerComp, playerApple;
    private Players[] playersTable = new Players[3];

    Messages messages = new Messages();
    Move move = new Move();
    RandomMachine randomMachine = new RandomMachine();
    GameStatus gameStatus = new GameStatus();
    BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
    Board board = new Board();

    StartGame() throws IOException {
        createPlayers();
        board.cleanBoard();
        System.out.println(messages.getInfo(0));
        while (game) startGame();
        System.out.println(messages.getInfo(3));
    }

    void createPlayers() {
        for (int i = 0; i < playersTable.length; i++) {
            playersTable[i] = createRandomPlayer();
        }
        player1 = playersTable[0];
        playerComp = playersTable[1];
        playerApple = playersTable[2];
    }

    private Players createRandomPlayer() {
        return new Players(randomMachine.returnRandomPos(numberSize),
                randomMachine.returnRandomPos(numberSize));
    }

    void startGame(){
        board.putPlayers(playersTable);
        board.printBoard();
        System.out.println(messages.getInfo(1));
        try {
            movePlayers();
        } catch (IOException e) {
            System.out.println(e);
            return;
        }
        game = gameStatus.checkGamePlayer(playersTable);
        gameRestart = gameStatus.checkGameEat(playersTable);

    }
    void movePlayers() throws IOException {
        move.setMove(read.readLine().toLowerCase());
        move.changeMove(player1);
        move.compPlayerMove(playersTable);
    }
}
