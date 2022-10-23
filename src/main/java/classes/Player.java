package classes;

public class Player {
    private String name, lastname;
    private char fileColor;

    public Player(String name, String lastname, char fileColor){
        this.name = name;
        this.lastname = lastname;
        this.fileColor = fileColor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public char getFileColor() {
        return fileColor;
    }

    public void setFileColor(char fileColor) {
        this.fileColor = fileColor;
    }
}
