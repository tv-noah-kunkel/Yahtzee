import java.util.ArrayList;
import java.util.Scanner;

public class Player {
    private  ArrayList<Die> hand = new ArrayList<>();
    private ArrayList<Die> heldDice = new ArrayList<>();
    private ArrayList<Die> finalDice = new ArrayList<>();
    private String name;
    private Scorecard scorecard = new Scorecard();

    public Player(String name){
        this.name = name;                                                                                                                                                                                                                                                                                                                                                          
    }
    DicePrinter DicePrinter = new DicePrinter();
    public void playTurn(){
        boolean keepPlaying = true;
        while(keepPlaying)
        {
    Scanner scanner = new Scanner(System.in);
    for(int i = 0; i < 5; i++)
    {
        Die die = new Die();
        die.roll();
        
        hand.add(die);
    }
    for(int i =0; i < 3; i++)
    {
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
        for(int j = 0; j < hand.size(); j++)
        {
            hand.get(i).roll();
        }
    }
    hand.addAll(heldDice);
    DicePrinter.print(hand);
    scorecard.printYahtzeeScorecard();
    System.out.println("Which category do you want to use (enter slot number): ");
    int slot = scanner.nextInt();
    if(slot == 1)
    {
        scorecard.setOnes(hand);
    }
    else if(slot == 2)
    {
        scorecard.setTwos(hand);
    }
    else if(slot == 3)
    {
        scorecard.setThrees(hand);
    }
    else if(slot == 4)
    {
        scorecard.setFours(hand);
    }
     else if(slot == 5)
    {
        scorecard.setFives(hand);
    }
     else if(slot == 6)
    {
        scorecard.setSixes(hand);
    }
     else if(slot == 7)
    {
        scorecard.setThreeOfAKind(hand);
    }
     else if(slot == 8)
    {
        scorecard.setFourOfAKind(hand);   
     }
      else if(slot == 8)
    {
        scorecard.setFourOfAKind(hand);
    }
     else if(slot == 9)
    {
        scorecard.setFullHouse(hand);
    }
     else if(slot == 10)
    {
        scorecard.setSmallStraight(hand);
    }
     else if(slot == 11)
    {
        scorecard.setlargeStraight(hand);
    }
     else if(slot == 12)
    {
        scorecard.setYahtzee(hand);
    }
     else if(slot == 13)
    {
        scorecard.setChance(hand);
    }
    System.out.println("keep playing (y/n): ");
    String playAgain = scanner.nextLine();
    if(playAgain.equals("y"))
    {
        keepPlaying = true;
    }
    else
    {
        keepPlaying = false;
    }
    
    
    
    }
}                                                         
}


























































 