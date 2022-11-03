package classes;

public class Victory {
    public static void victory(PlayerFile[][] board){
        int blackPlayer=0;
        int redPlayer=0;
        for(int i=0;i<GlobalConstants.ROWS;i++){
            for(int j=0;j<GlobalConstants.COLUMN;j++){
                if (board[i][j].getColor()==GlobalConstants.BLACK){
                    blackPlayer++;
                }
                if (board[i][j].getColor()==GlobalConstants.RED){
                    redPlayer++;
                }
            }
        }
        if(redPlayer<3){
            System.out.println("Victoria para el jugador negro");
        }
        if (blackPlayer<3){
            System.out.println("Victoria para el jugador rojo");
        }
    }
}
