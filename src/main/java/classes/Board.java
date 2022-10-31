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
                System.out.print(files[i][j].getFileName() + "\t");
            }
            System.out.println('\n');
        }
    }
    public void makeMove(int row, int column) {
        if (row >= 0 && row < GlobalConstants.ROWS && column >= 0 && column < GlobalConstants.COLUMN) {
            if ( Game.currentTurn== GlobalConstants.BLACK) {
                Game.currentTurn=GlobalConstants.RED;
            } else {
                Game.currentTurn= GlobalConstants.BLACK;
            }

        }else{
                System.out.println("Movimiento invalido en (" + row + "," + column + ")");
        }
    }

    public void setFileInPosition(int row, int column){
        if (row >= 0 && row < GlobalConstants.ROWS && column >= 0 && column < GlobalConstants.COLUMN) {
            files[row][column].setColor(Game.currentTurn);

            if ( Game.currentTurn== GlobalConstants.BLACK) {
                Game.currentTurn=GlobalConstants.RED;
            } else {
                Game.currentTurn = GlobalConstants.BLACK;
            }
        }else{
            System.out.println("Movimiento invalido en (" + row + "," + column + ")");
        }
    }

}
