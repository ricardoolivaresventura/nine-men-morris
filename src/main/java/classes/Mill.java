package classes;

public class Mill {

    public static Boolean mill(PlayerFile[][] board,int row,int column){
        if (row >= 0 && row < GlobalConstants.ROWS && column >= 0 && column < GlobalConstants.COLUMN) {
            if(row==3 || column == 3){
                return specialMill(board,  row,  column);
            }
            return horizontalMill(board,row,column);
        }
        return false;
    }

    public static Boolean horizontalMill(PlayerFile[][] board,int rows,int columns){
        int cont = 0;
        //search in rows
        for(int i=0;i<7;i++){
            if(board[rows][i].getColor()==Game.currentTurn){
                cont++;
            }
        }
        if(cont==3){
            return true;
        }
        return verticalMill(board,rows,columns);
    }

    public static Boolean verticalMill(PlayerFile[][] board, int rows,int columns){
        int cont = 0;
        //search in columns
        for(int i=0;i<7;i++){
            if(board[i][columns].getColor()==Game.currentTurn){
                cont++;
            }
        }
        if(cont==3){
            return true;
        }
        return false;
    }
    public static Boolean specialMill(PlayerFile[][] board, int rows,int columns){
        if(rows == 3){
            if(board[rows][0].getColor()==Game.currentTurn && board[rows][1].getColor()==Game.currentTurn && board[rows][2].getColor()==Game.currentTurn){
                return true;
            }else if(board[rows][4].getColor()==Game.currentTurn && board[rows][5].getColor()==Game.currentTurn && board[rows][6].getColor()==Game.currentTurn){
                return true;
            }else{
                return verticalMill(board,  rows,  columns);
            }
        }
        if(columns == 3){
            if(board[0][columns].getColor()==Game.currentTurn && board[1][columns].getColor()==Game.currentTurn && board[2][columns].getColor()==Game.currentTurn){
                return true;
            }else if(board[4][columns].getColor()==Game.currentTurn && board[5][columns].getColor()==Game.currentTurn && board[6][columns].getColor()==Game.currentTurn){
                return true;
            }else{
                return horizontalMill(board,  rows,  columns);
            }
        }
        return false;
    }
}
