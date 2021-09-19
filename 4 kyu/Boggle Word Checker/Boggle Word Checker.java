public class Boggle {
    private final char[][] board;
    private final String word;

    public Boggle(final char[][] board, final String word) {
        this.board = board;
        this.word = word;
    }

    public boolean check() {
        if (word == null || word.isEmpty()) {
            return false;
        }
        int[][] usedCoords = new int[board.length][board[0].length];

        for (int y = 0; y < board.length; y++) {
            for (int x = 0; x < board[y].length; x++) {
                if (board[y][x] == word.charAt(0) && isMatch(x, y, 1, usedCoords))
                    return true;
            }
        }
        return false;
    }

    private boolean isMatch(int prevX, int prevY, int currentIndex, int[][] usedCoords) {
        if (currentIndex >= word.length()) return true;

        char currentChar = word.charAt(currentIndex);
        usedCoords[prevY][prevX] = 1;

        for (int y = prevY - 1; y <= prevY + 1; y++) {
            for (int x = prevX - 1; x <= prevX + 1; x++) {
                if (y >= 0 && x >= 0 && y < board.length && x < board[y].length) {
                    if (board[y][x] == currentChar && usedCoords[y][x] != 1 &&
                            isMatch(x, y, currentIndex + 1, usedCoords))
                        return true;
                }
            }
        }

        usedCoords[prevY][prevX] = 0;

        return false;
    }
}
