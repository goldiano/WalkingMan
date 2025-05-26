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
    void compPlayerMove(Players compMove, Players player1) {
        if(compMove.getPlayersY() > player1.getPlayersY()) compMove.setPlayersY(compMove.getPlayersY() - 1);
        if(compMove.getPlayersY() < player1.getPlayersY()) compMove.setPlayersY(compMove.getPlayersY() + 1);
        if(compMove.getPlayersX() > player1.getPlayersX()) compMove.setPlayersX(compMove.getPlayersX() - 1);
        if(compMove.getPlayersX() < player1.getPlayersX()) compMove.setPlayersX(compMove.getPlayersX() + 1);
    }
    void setMove(String move) {
        this.move = move;
    }
    String getMove() {
        return move;
    }
}
