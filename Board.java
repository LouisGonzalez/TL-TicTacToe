public class Board {

    public final int BOARD_SIZE = 3;
    private int[][] myBoard = new int[BOARD_SIZE][BOARD_SIZE];
    private final VerifyWin vw = new VerifyWin(this);


    public void initialValues(){
        for(int i = 0; i < BOARD_SIZE; i++){
            for(int j = 0; j < BOARD_SIZE; j++){
                myBoard[i][j] = 0;
            }
        }
    }

    public void printBoard(){
        String boardPrinted = "";
        for(int i = 0; i < BOARD_SIZE; i++){
            for(int j = 0; j < BOARD_SIZE; j++){
                if(myBoard[i][j] == 1){
                    boardPrinted += "| X |";
                } else if(myBoard[i][j] == 2){
                    boardPrinted += "| O |";
                } else if(myBoard[i][j] == 0){
                    boardPrinted += "|   |";
                }
            }
            boardPrinted += "\n";
        }
        System.out.println(boardPrinted);
    }

    public int[][] getBoard(){
        return myBoard;
    }

    public boolean isEmptySpaces(int contMovements){
        if(contMovements >= 9) return true;
        return false;
    }

    public boolean isTicTacToe(int posX, int posY, int player){
        return vw.verifyWinX(posX, posY, player);
    }
}
