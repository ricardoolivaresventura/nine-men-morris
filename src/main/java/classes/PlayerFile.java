package classes;

public class PlayerFile {
    private char color;
    private int row, column;
    private float positionUIX, positionUIY;
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

    public String getPositionInMatrix (){
        return "Fila: "+ this.row + ", Columna: " + this.column;
    }

    public float getPositionUIX() {
        return positionUIX;
    }

    public void setPositionUIX(float positionUIX) {
        this.positionUIX = positionUIX;
    }

    public float getPositionUIY() {
        return positionUIY;
    }

    public void setPositionUIY(float positionUIY) {
        this.positionUIY = positionUIY;
    }
}
