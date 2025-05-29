public class GameStatus {

    boolean checkGamePlayer(Players[] playersTable) {
        return playersTable[0].getPlayersY() != playersTable[1].getPlayersY() ||
               playersTable[0].getPlayersX() != playersTable[1].getPlayersX();
    }
    boolean checkGameEat(Players[] playersTable) {
        return playersTable[2].getPlayersY() != playersTable[1].getPlayersY() ||
               playersTable[2].getPlayersX() != playersTable[1].getPlayersX();
    }
}
