public class Move {
    private String move;

    void changeMove(Players player1) {
        switch(move) {
            case "up":
                player1.setPlayersY(player1.getPlayersY() - 1);
                break;
            case "down":
                player1.setPlayersY(player1.getPlayersY() + 1);
                break;
            case "left":
                player1.setPlayersX(player1.getPlayersX() - 1);
                break;
            case "right":
                player1.setPlayersX(player1.getPlayersX() + 1);
                break;
            case "up-left":
                player1.setPlayersX(player1.getPlayersX() - 1);
                player1.setPlayersY(player1.getPlayersY() - 1);
                break;
            case "up-right":
                player1.setPlayersX(player1.getPlayersX() + 1);
                player1.setPlayersY(player1.getPlayersY() - 1);
                break;
            case "down-right":
                player1.setPlayersX(player1.getPlayersX() + 1);
                player1.setPlayersY(player1.getPlayersY() + 1);
                break;
            case "down-left":
                player1.setPlayersX(player1.getPlayersX() - 1);
                player1.setPlayersY(player1.getPlayersY() + 1);
                break;
            default:
                System.out.println("Uknown move");
        }
    }
    void compPlayerMove(Players[] players) {
        int dy = Integer.compare(players[0].getPlayersY(), players[1].getPlayersY());
        int dx = Integer.compare(players[0].getPlayersX(), players[1].getPlayersX());
        players[1].setPlayersY(players[1].getPlayersY() + dy);
        players[1].setPlayersX(players[1].getPlayersX() + dx);
    }
    void setMove(String move) {
        this.move = move;
    }
    String getMove() {
        return move;
    }
}
