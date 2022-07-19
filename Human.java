import java.util.Scanner;

public class Human extends Player {
    
    public Human(Game game, Board board){
        super(game, board);
    }

    public int askPosition(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Type a number:");
        int number = Integer.parseInt(sc.nextLine());
        if(number < 1 || number > 3){
            System.out.println("Invalid range position");
            return askPosition();
        } else {
            return number - 1;
        }
    }
}
