import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;


public class Scorecard{

    private Map<String, Integer> scorecard = new HashMap<>();

    public Scorecard()
    {
        scorecard.put("ones", 0);
        scorecard.put("twos", 0);
        scorecard.put("threes", 0);
        scorecard.put("fours", 0);
        scorecard.put("fives", 0);
        scorecard.put("sixes", 0);
        scorecard.put("three of a kind", 0);
        scorecard.put("four of a kind", 0);
        scorecard.put("small straight", 0);
        scorecard.put("large straight", 0);
        scorecard.put("yahtzee", 0);
        scorecard.put("chance", 0);
        scorecard.put("top total", 0);
        scorecard.put("bottom total", 0);
        


    }           

    public void setOnes(ArrayList<Die> hand){
        int ones= 0;
        for(int i = 1; i < hand.size()+1; i++)
        {
            if(hand.get(i).getValue()==1)
            {
                ones++;
            }

        }
        scorecard.put("ones", ones);
    }

    public void setTwos(ArrayList<Die> hand){
        int k= 0;
        for(int i = 1; i < hand.size()+1; i++)
        {
            if(hand.get(i).getValue()==2)
            {
                k++;
            }
        }
        k = k*2;
        scorecard.put("twos", k);
    }
    public void setThrees(ArrayList<Die> hand){
        int k= 0;
        for(int i = 1; i < hand.size()+1; i++)
        {
            if(hand.get(i).getValue()==3)
            {
                k++;
            }
        }
        k = k*3;
        scorecard.put("threes", 3);
    }
    public void setFours(ArrayList<Die> hand){
        int k= 0;
        for(int i = 1; i < hand.size()+1; i++)
        {
            if(hand.get(i).getValue()==4)
            {
                k++;
            }
        }
        k = k*4;
        scorecard.put("fours", k);
    }

    public void setFives(ArrayList<Die> hand){
        int k= 0;
        for(int i = 1; i < hand.size()+1; i++)
        {
            if(hand.get(i).getValue()==5)
            {
                k++;
            }
        }
        k = k*5;
        scorecard.put("fives", k);
    }
    public void setSixes(ArrayList<Die> hand){
        int k= 0;
        for(int i = 1; i < hand.size()+1; i++)
        {
            if(hand.get(i).getValue()==6)
            {
                k++;
            }
        }
        k = k*6;
        scorecard.put("sixes", k);
    }
    public void setThreeOfAKind(ArrayList<Die> hand){
        for(int i = 0; i < 7; i++)
        {
            for(int j = 0; j < 5; j++)
            {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
            }
        }
    }
}