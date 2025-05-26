public class GameStatus {
    int checkGame(Players player1, Players playerComp, Players playerApple) {
        if(player1.getPlayersX() == playerApple.getPlayersX() &&
        player1.getPlayersY() == playerApple.getPlayersY()) return 1;

        else if(player1.getPlayersX() == playerComp.getPlayersX() &&
        player1.getPlayersY() == playerComp.getPlayersY()) return 2;

        else return 0;
    }
}
