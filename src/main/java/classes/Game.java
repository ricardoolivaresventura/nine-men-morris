package classes;

public class Game {
    static public char gameMode;
    static public char currentTurn;
    static public Player p1, p2;
    public Game(){

    }

    public void initializeGame(){

    }

    public static Player getP1() {
        return p1;
    }

    public static Player getP2() {
        return p2;
    }

    static public void setPlayer1(char color){
        Player player = new Player("Player 1","",color);
        p1 = player;
    }

    static public void setPlayer2(char color){
        Player player = new Player("Player 2","",color);
        p2 = player;
    }

    static public void showPlayers(){
        System.out.println("PLAYER 1: " + p1.getName() + p1.getFileColor());
        System.out.println("PLAYER 2: " + p2.getName() + p2.getFileColor());
    }

}
