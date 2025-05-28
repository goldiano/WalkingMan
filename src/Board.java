import java.util.Arrays;

class Board {
    private final int width = 10;
    private final int height  = 10;
    private final int[][] boardGame = new int[width][height];

    void cleanBoard() {
        for (int a = 0; a < boardGame.length; a++) {
            Arrays.fill(boardGame[a], 0);
        }
    }
    void printBoard() {
        for (int[] row : boardGame) {
            for (int cell : row) {
                char symbol;
                switch (cell) {
                    case 1: symbol = 'X'; break;
                    case 2: symbol = 'E'; break;
                    case 3: symbol = 'A'; break;
                    default: symbol = ' ';
                }
                System.out.print("[" + symbol + "]");
            }
            System.out.println();
        }
    }
    void cleanMove() {
        
    }
    

}