package rocks.zipcode.io.quiz3.arrays;

/**
 * @author leon on 09/12/2018.
 */
public class TicTacToe {

    private String[][] board;

    String topLeft;
    String topMid;
    String topRight;

    String midLeft;
    String midMid;
    String midRight;

    String botLeft;
    String botMid;
    String botRight;


    public TicTacToe(String[][] board) {
        this.board = board;

        topLeft = board[0][0];
        topMid = board[0][1];
        topRight = board[0][2];

        midLeft = board[1][0];
        midMid = board[1][1];
        midRight = board[1][2];

        botLeft = board[2][0];
        botMid = board[2][1];
        botRight = board[2][2];
    }

    public TicTacToe() {
    }

    public String[] getRow(Integer value) {
        if (value == 0) return new String[]{topLeft, topMid, topRight};
        else if (value == 1) return new String[]{midLeft, midMid, midRight};
        else return new String[]{botLeft, botMid, botRight};
    }

    public String[] getColumn(Integer value) {
        if (value == 0) {
            return new String[]{topLeft, midLeft, botLeft};
        } else if (value == 1) {
            return new String[]{topMid, midMid, botMid};
        } else
        return new String[]{topRight, midRight, botRight};
    }

    public Boolean isRowHomogenous(Integer rowIndex) {
        String[] row = getRow(rowIndex);
        return row[0].equals(row[1]) || row[1].equals(row[2]);
    }

    public Boolean isColumnHomogeneous(Integer columnIndex) {
        String[] column = getColumn(columnIndex);
        return column[0].equals(column[1]) || column[1].equals(column[2]);
    }

    public String getWinner() {
        String[][] newBoard = getBoard();

        return null;
    }

    public String[][] getBoard() {
        return this.board;
    }


}
