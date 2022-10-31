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
            if(board[rows][i]=='B'){
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
            if(board[i][columns]=='B'){
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
            if(board[rows][0]=='B' && board[rows][1]=='B' && board[rows][2]=='B'){
                return true;
            }else if(board[rows][4]=='B' && board[rows][5]=='B' && board[rows][6]=='B'){
                return true;
            }else{
                return verticalMill(board,  rows,  columns);
            }
        }
        if(columns == 3){
            if(board[0][columns]=='B' && board[1][columns]=='B' && board[2][columns]=='B'){
                return true;
            }else if(board[4][columns]=='B' && board[5][columns]=='B' && board[6][columns]=='B'){
                return true;
            }else{
                return horizontalMill(board,  rows,  columns);
            }
        }
        return false;
    }
}
