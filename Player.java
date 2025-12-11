import java.util.ArrayList;
import java.util.Scanner;

public class Player {
    private  ArrayList<Die> hand = new ArrayList<>();
    private ArrayList<Die> heldDice = new ArrayList<>();
    private ArrayList<Die> finalDice = new ArrayList<>();
    private String name;

    public Player(String name){
        this.name = name;                                                                                                                                                                                                                                                                                                                                                          
    }
    DicePrinter DicePrinter = new DicePrinter();
    public void playTurn(){
    Scanner scanner = new Scanner(System.in);
    for(int i = 0; i < 5; i++)
    {
        Die die = new Die();
        die.roll();
        
        hand.add(die);
    }
    for(int i =0; i < 3; i++){
        DicePrinter.print(hand);
   System.out.println("which dice would you like to hold (put 0 if none)");
   String holding = scanner.nextLine(); 
   if(holding.contains("5"))
   {
    heldDice.add(hand.get(4));
    hand.remove(4);
   }
   if(holding.contains("4"))
   {
    heldDice.add(hand.get(3));
    hand.remove(3);
   }
    
   if(holding.contains("3"))
   {
    heldDice.add(hand.get(2));
    hand.remove(2);
   }
    
   if(holding.contains("2"))
   {
    heldDice.add(hand.get(1));
    hand.remove(1);                                                                     
   }
    
   if(holding.contains("1"))
   {
    heldDice.add(hand.get(0));
    hand.remove(0);
   }
   System.out.println("Held Dice");
   DicePrinter.print(heldDice);
  
}




    DicePrinter.print(hand);
    
    
    }
                                                               
}


























































 