package Oops.Static;

public class Game {
    String kill;
    static int gameScore;

    public Game(String kill) {
        this.kill = kill;
        Game.gameScore = gameScore+1;
    }


    public static void main(String[] args) {
     
        //only static things can be called inside psvm;
        
        //grreting is called when object is created but static methosd doesnot depend on object thus you cannot call greeting inside it 

        // greeting();

        // Game game1 = new Game("lop");
        // String ans = game1.greeting();
        // System.out.println(ans);
    } 
    
    void greeting(){
        System.out.println("hello");
    }

    
}
