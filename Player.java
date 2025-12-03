import java.util.ArrayList;

public class Player {
    private  ArrayList<Die> hand = new ArrayList<>();
    private ArrayList<Die> heldDice = new ArrayList<>();
    private String name;

    public Player(String name){
        this.name = name;                                                                                                                                                                                                                                                                                                                                                          
    }
    DicePrinter DicePrinter = new DicePrinter();
    public void playTurn(){
    for(int i = 0; i < 5; i++)
    {
        Die die = new Die();
        die.roll();
        
        hand.add(die);
    }
    DicePrinter.print(hand);
    }
                                                               
}


























































 