public class Players {
    private int xPos;
    private int yPos;

    Players(int xPos, int yPos) {
        this.xPos = xPos;
        this.yPos = yPos;
    }
    int getPlayersX() {
        return xPos;
    }
    int getPlayersY() {
        return yPos;
    }
    void setPlayersX(int xPos) {
        this.xPos = xPos;
    }
    void setPlayersY(int yPos) {
        this.yPos = yPos;
    }
}
