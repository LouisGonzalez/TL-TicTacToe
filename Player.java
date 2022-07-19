public abstract class Player {
    
    private Board board;
    private Game game;

    public Player(Game game, Board board){
        this.board = board;
        this.game = game;
    }

    abstract public int askPosition();

    public boolean putCoin(int posX, int posY, int player){
        if(board.getBoard()[posX][posY] == 0){
            board.getBoard()[posX][posY] = player;
        } else {
            System.out.println("Invalid move");
            if(game.getContMovements() < 8) return false;
        }
        return true;    
    }

}
