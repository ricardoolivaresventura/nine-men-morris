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


    public static void main(String[] args) {
        Board b = new Board();

    }
}
