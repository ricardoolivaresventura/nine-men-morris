package classes;

public class Game {
    static public char gameMode;
    static public char currentTurn;
    static public Player p1, p2;
    public Game(){

    }

    public void initializeGame(){

    }

    public void setPlayer1(char color){
        Player player = new Player("Player 1","",color);
        p1 = player;
    }

    public void setPlayer2(char color){
        Player player = new Player("Player 2","",color);
        p2 = player;
    }

}
