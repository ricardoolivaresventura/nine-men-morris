package textMill;

public class testMill {
    public static void main(String[] args) {
        char [][] board = {
                {'C','X','X','C','X','X','C'},
                {'X','C','X','C','X','C','X'},
                {'X','X','C','C','C','X','X'},
                {'C','C','C','X','C','C','C'},
                {'X','X','B','B','B','X','X'},
                {'X','C','X','B','X','C','X'},
                {'C','X','X','B','X','X','C'}
        };
        int rows = 4;
        int columns = 3;

        System.out.println(mill(board,rows,columns));
    }
    static Boolean mill(char[][] board,int rows,int columns){
        if(rows==3 || columns == 3){
            return specialMill(board,  rows,  columns);
        }
        return horizontalMill(board,rows,columns);
    }
    static Boolean horizontalMill(char[][] board,int rows,int columns){
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
    static Boolean verticalMill(char[][] board, int rows,int columns){
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
    static Boolean specialMill(char[][] board, int rows,int columns){
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
