package classes;

public class PlayerFile {
    private char color;
    private int row, column;

    private String nameFile;
    public static PlayerFile fil_null(){
        PlayerFile f = new PlayerFile();
        f.setColumn(10);
        f.setRow(10);
        f.setColor('N');
        f.setNameFile("Null");
        return f;

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
    public String getNameFile() {
        return nameFile;
    }
    public void setNameFile(String nameFile) {
        this.nameFile = nameFile;
    }


}
