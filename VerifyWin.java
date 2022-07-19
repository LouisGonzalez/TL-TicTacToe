public class VerifyWin {
    
    private Board board;

    public VerifyWin(Board board){
        this.board = board;
    }

    public boolean verifyWinX(int positionX, int positionY, int player){
        int auxX = 0;
        while(auxX < board.BOARD_SIZE){
            if(auxX != positionX){
                if(board.getBoard()[auxX][positionY] != player) return verifyWinY(positionX, positionY, player);
            }
            auxX++;
        }
        return true;    
    }

    public boolean verifyWinY(int positionX, int positionY, int player){
        int auxY = 0;
        while(auxY < board.BOARD_SIZE){
            if(auxY != positionY){
                if(board.getBoard()[positionX][auxY] != player) return verifyWinYX(player);
            }
            auxY++;
        }
        return true;
    }

    public boolean verifyWinXY(int player){
        int auxX = 0, auxY = 0;
        while(auxX < board.BOARD_SIZE && auxY < board.BOARD_SIZE){
            if(board.getBoard()[auxX][auxY] != player) return verifyWinYX(player);
            auxX++; auxY++;
        }
        return true;
    }

    public boolean verifyWinYX(int player){
        int auxX = 0, auxY = 2;
        while(auxX < board.BOARD_SIZE && auxY >=0){
            if(board.getBoard()[auxX][auxY] != player) return false;
            auxX++; auxY--;
        }
        return true;
    }

}
