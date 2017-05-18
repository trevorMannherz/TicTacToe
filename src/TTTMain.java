import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;

/**
 * Created by block7 on 5/15/17.
 */
//https://www3.ntu.edu.sg/home/ehchua/programming/java/JavaGame_TicTacToe.html
public class TTTMain {

    public static final int blank = 0;
    public static final int x = 1;
    public static final int o = 2;
    public static final int rows = 3;
    public static final int columns = 3;

    public static final int playing = 0;
    public static final int xWin = 1;
    public static final int oWin = 2;
    public static final int tie = 3;

    //1 = x 2 = o
    public static int player;
    //public static int[][] field = new int[rows][columns];

    public TTTPanel Panel;

    public enum spot{
        blank, x, o
    }

    private spot[][] field;


    public TTTMain() {
        Panel = new TTTPanel();

    }

    public static boolean win(int row, int column, int place) {
        return true;

    }

    public static void main(String args[]) {
        TTTMain main = new TTTMain();

    }

    class TTTPanel extends JPanel {

        public void paintComponent (Graphics g) {
            super.paintComponent(g);
            setBackground(Color.WHITE);
            g.setColor(Color.blue);
            g.drawLine(20, 30, 400, 400);

            for (int row = 1; row < rows; ++row) {
                g.fillRoundRect(0, 100 * row - 4,
                        299, 8, 8, 8);
            }
            for (int col = 1; col < columns; ++col) {
                g.fillRoundRect(100 * col - 4, 0,
                        8, 299, 8, 8);
            }


            for (int row = 1; row < rows; ++row) {
                g.fillRoundRect(0, CELL_SIZE * row - GRID_WIDHT_HALF,
                        100*columns-1, GRID_WIDTH, GRID_WIDTH, GRID_WIDTH);
            }
            for (int col = 1; col < cols; ++col) {
                g.fillRoundRect(CELL_SIZE * col - GRID_WIDHT_HALF, 0,
                        GRID_WIDTH, CANVAS_HEIGHT-1, GRID_WIDTH, GRID_WIDTH);
            }

            for (int r = 0; r < rows; r++) {
                for (int c = 0; c < columns; c++) {

                }

            }
        }


    }

}


