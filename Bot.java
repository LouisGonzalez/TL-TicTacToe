public class Bot extends Player {
 
    public Bot(Game game, Board board){
        super(game, board);
    }

    public int askPosition(){
        return (int) (Math.floor(Math.random() * 3 + 1)) - 1;
    }

}
