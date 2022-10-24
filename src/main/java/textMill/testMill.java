package textMill;

public class testMill {
    public static void main(String[] args) {
        char [][] board = {
                {'C','X','X','C','X','X','C'},
                {'X','B','X','B','X','B','X'},
                {'X','X','C','C','C','X','X'},
                {'C','C','C','X','C','C','C'},
                {'X','X','C','C','C','X','X'},
                {'X','C','X','C','X','C','X'},
                {'C','X','X','C','X','X','C'}
        };
        int rows = 1;
        int columns = 1;

        System.out.println(horizontalMill(board,rows,columns));
    }
    /*static Boolean mill(char[][] board,int rows,int columns){

    }*/
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
        return false;
    }
}
