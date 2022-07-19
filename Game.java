public class Game {
    
    private final Board board = new Board();
    private Player player1 = new Human(this, board);
    private Player player2 = new Bot(this, board);
    private Executor exe = new Executor();
    private int contMovements = 0;
    private boolean gameOver = false;

    public void initialValues(){
        board.initialValues();
        board.printBoard();
    }

    public void go(){
        initialValues();
        do {
            round();
        } while(!gameOver);
    }

    public void round(){
        turn(1);
        board.printBoard();
        if(!gameOver){
            turn(2);
            board.printBoard();
        }
    }

    public void turn(int player){
        switch(player){
            case 1:
                executeTurn(player1, 1);
                break;
            case 2:
                executeTurn(player2, 2);
                break;
            default:
                break;
        }
    }

    public void executeTurn(Player player, int playerNumber){
        int posX = exe.executeTask(player);
        int posY = exe.executeTask(player);
        if(!player.putCoin(posX, posY, playerNumber)) turn(playerNumber);
        else {
            contMovements++;
            if(!board.isTicTacToe(posX, posY, playerNumber)){
                gameOver = board.isEmptySpaces(contMovements);
                if(gameOver) System.out.println("NADIE HA PODIDO GANAR");
            } else {
                gameOver = true;
                System.out.println("HA GANADO EL JUGADOR "+playerNumber);
            }
        }
    }

    public int getContMovements(){
        return contMovements;
    }

    public void setContMovements(int contMovements){
        this.contMovements = contMovements;
    }

    public boolean getGameOver(){
        return gameOver;
    }

}
