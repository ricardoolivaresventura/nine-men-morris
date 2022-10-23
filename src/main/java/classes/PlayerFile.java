package classes;

public class PlayerFile {
    private char color;
    private int row, column;
    public PlayerFile(char color, int row, int column) {
        this.color = color;
        this.row = row;
        this.column = column;
    }

    public PlayerFile(char color){
        this.color = color;
    }

    public char getColor() {
        return color;
    }

    public void setColor(char color) {
        this.color = color;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public String getPositions (){
        return "Fila: "+ this.row + ", Columna: " + this.column;
    }
}
