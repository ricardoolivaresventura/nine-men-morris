package classes;

public class Board {
    private PlayerFile[][] files;

    public Board() {
        files = new PlayerFile[GlobalConstants.ROWS][GlobalConstants.COLUMN];
        for (int i = 0; i < GlobalConstants.ROWS; i++) {
            for (int j = 0; j < GlobalConstants.COLUMN; j++) {
                files[i][j] = PlayerFile.fil_null();
            }
        }
    }

    public void displayBoard() {

        for (int i = 0; i < GlobalConstants.ROWS; i++) {
            for (int j = 0; j < GlobalConstants.COLUMN; j++) {
                System.out.print(files[i][j].getNameFile() + "\t");
            }
            System.out.println('\n');
        }
    }

    public static void main(String[] args) {
        Board b = new Board();
        b.displayBoard();
    }
}
