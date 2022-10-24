package classes;

import java.util.Scanner;

public class FileInBoard {
    private Game player_;
    private PlayerFile file_;

    public FileInBoard(Game Fplayer_, PlayerFile Ffile_) {
        this.player_ = Fplayer_;
        this.file_ = Ffile_;

    }

    /*
    public void makeMove(int row, int column) {
        if (row >= 0 && row < GlobalConstants.ROWS && column >= 0 && column < GlobalConstants.COLUMN) {
            if (file_.getColor() == GlobalConstants.BLACK) {
                file_.setColor(GlobalConstants.RED);
            } else {
                file_.setColor(GlobalConstants.BLACK);
            }

        }
    }
    */

    public void Play() {
        boolean done = false;
        int row, column;
        Scanner in = new Scanner(System.in);
        System.out.println("Bienvenido al juego Nine Men´s Morris!");
        System.out.println("Actual jugador: " + player_.));
        System.out.print("Mueve en la fila: ");
        row = in.nextInt();
        System.out.print("Mueve en la columna: ");
        column = in.nextInt();

        file_.setRow(row);
        file_.setColumn(column);
        if (file_.getRow() < 0 || file_.getRow() > GlobalConstants.ROWS || file_.getColumn() < 0 || file_.getColumn() > GlobalConstants.COLUMN)
            System.out.println("Movimiento invalido en (" + file_.getRow() + "," + file_.getColumn() + ")");
        else {
            //makeMove(row, column);
        }
    }
}