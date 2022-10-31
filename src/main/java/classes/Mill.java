package classes;

public class Mill {
    private PlayerFile[][] files;
    private int row;
    private int column;

    public Mill(PlayerFile[][] files, int row, int column){
        this.files = files;
        this.row = row;
        this.column = column;
    }

    Boolean mill(PlayerFile[][] board,int rows,int columns){
        if(rows==3 || columns == 3){
            return specialMill(board,  rows,  columns);
        }
        return horizontalMill(board,rows,columns);
    }

    Boolean horizontalMill(PlayerFile[][] board,int rows,int columns){
        int cont = 0;
        //search in rows
        for(int i=0;i<7;i++){
            if(board[rows][i].getColor()=='B'){
                cont++;
            }
        }
        if(cont==3){
            return true;
        }
        return verticalMill(board,rows,columns);
    }

    Boolean verticalMill(PlayerFile[][] board, int rows,int columns){
        int cont = 0;
        //search in columns
        for(int i=0;i<7;i++){
            if(board[i][columns].getColor()=='B'){
                cont++;
            }
        }
        if(cont==3){
            return true;
        }
        return false;
    }
    Boolean specialMill(PlayerFile[][] board, int rows,int columns){
        if(rows == 3){
            if(board[rows][0].getColor()=='B' && board[rows][1].getColor()=='B' && board[rows][2].getColor()=='B'){
                return true;
            }else if(board[rows][4].getColor()=='B' && board[rows][5].getColor()=='B' && board[rows][6].getColor()=='B'){
                return true;
            }else{
                return verticalMill(board,  rows,  columns);
            }
        }
        if(columns == 3){
            if(board[0][columns].getColor()=='B' && board[1][columns].getColor()=='B' && board[2][columns].getColor()=='B'){
                return true;
            }else if(board[4][columns].getColor()=='B' && board[5][columns].getColor()=='B' && board[6][columns].getColor()=='B'){
                return true;
            }else{
                return horizontalMill(board,  rows,  columns);
            }
        }
        return false;
    }
}
