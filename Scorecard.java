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
        scorecard.put("full house", 0);
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
        int ones=0;
        int twos=0;
        int threes=0;
        int fours=0;
        int fives=0;
        int sixes=0; 
        int finalVal = 0;
        for(int j = 0; j < 5; j++)
            {
                if(hand.get(j).getValue()==1)
                {
                    ones++;
                }
            }
        for(int j = 0; j < 5; j++)
            {
                if(hand.get(j).getValue()==2)
                {
                    twos++;
                }
            }
        for(int j = 0; j < 5; j++)
            {
                if(hand.get(j).getValue()==3)
                {
                    threes++;
                }
            }
            for(int j = 0; j < 5; j++)
            {
                if(hand.get(j).getValue()==4)
                {
                    fours++;
                }
            }
            for(int j = 0; j < 5; j++)
            {
                if(hand.get(j).getValue()==5)
                {
                    fives++;
                }
            }
            for(int j = 0; j < 5; j++)
            {
                if(hand.get(j).getValue()==6)
                {
                    sixes++;
                }
            }
            if(ones==3||twos==3||threes==3||fours==3||fives==3||sixes==3)
            {
                for(int i = 0; i < 6;i++)
                {
                    finalVal+=hand.get(i).getValue();
                }
            }
            scorecard.put("three of a kind", finalVal);
            
        
    }
    public void setFourOfAKind(ArrayList<Die> hand){
        int ones=0;
        int twos=0;
        int threes=0;
        int fours=0;
        int fives=0;
        int sixes=0; 
        int finalVal = 0;
        for(int j = 0; j < 5; j++)
            {
                if(hand.get(j).getValue()==1)
                {
                    ones++;
                }
            }
        for(int j = 0; j < 5; j++)
            {
                if(hand.get(j).getValue()==2)
                {
                    twos++;
                }
            }
        for(int j = 0; j < 5; j++)
            {
                if(hand.get(j).getValue()==3)
                {
                    threes++;
                }
            }
            for(int j = 0; j < 5; j++)
            {
                if(hand.get(j).getValue()==4)
                {
                    fours++;
                }
            }
            for(int j = 0; j < 5; j++)
            {
                if(hand.get(j).getValue()==5)
                {
                    fives++;
                }
            }
            for(int j = 0; j < 5; j++)
            {
                if(hand.get(j).getValue()==6)
                {
                    sixes++;
                }
            }
            if(ones==4||twos==4||threes==4||fours==4||fives==4||sixes==4)
            {
                for(int i = 0; i < 6;i++)
                {
                    finalVal+=hand.get(i).getValue();
                }
            }
            scorecard.put("four of a kind", finalVal);
        }

        public void setSmallStraight(ArrayList<Die> hand){
            ArrayList<Integer> handVals = new ArrayList<>();
            boolean smallStraight = false;
            for(int i = 0; i < 6; i++)
            {
                handVals.add(hand.get(i).getValue());
            }
            if(handVals.contains(1)&&handVals.contains(2)&&handVals.contains(3)&&handVals.contains(4))
            {
                smallStraight = true;
            }
            else if(handVals.contains(2)&&handVals.contains(3)&&handVals.contains(4)&&handVals.contains(5)){
                smallStraight = true;
            }
            else if(handVals.contains(3)&&handVals.contains(4)&&handVals.contains(5)&&handVals.contains(6)){
                smallStraight = true;
            }
            if (smallStraight==true)
            {
                scorecard.put("small straight", 30);
            }
            else{
                scorecard.put("small straight", 0);
            }
        }

        public void setlargeStraight(ArrayList<Die> hand){
            ArrayList<Integer> handVals = new ArrayList<>();
            boolean largeStraight = false;
            for(int i = 0; i < 6; i++)
            {
                handVals.add(hand.get(i).getValue());
            }
            if(handVals.contains(1)&&handVals.contains(2)&&handVals.contains(3)&&handVals.contains(4)&&handVals.contains(5))
            {
                largeStraight = true;
            }
            else if(handVals.contains(2)&&handVals.contains(3)&&handVals.contains(4)&&handVals.contains(5)&&handVals.contains(6)){
                largeStraight = true;
            }
           
            
            if (largeStraight==true)
            {
                scorecard.put("large straight", 40);
            }
            else{
                scorecard.put("large straight", 0);
            }
        }

        public void setTopTotal()
        {
            int topTotal = 0;
            topTotal = topTotal + scorecard.get("ones") + scorecard.get("twos") + scorecard.get("threes") + scorecard.get("fours") + scorecard.get("fives") + scorecard.get("sixes");  
            if(topTotal >= 63) 
            {
                topTotal += 35;
            }
        } 
        public void setFullHouse(ArrayList<Die> hand)
        {
        int ones=0;
        int twos=0;
        int threes=0;
        int fours=0;
        int fives=0;
        int sixes=0; 
        int finalVal = 0;
        for(int j = 0; j < 5; j++)
            {
                if(hand.get(j).getValue()==1)
                {
                    ones++;
                }
            }
        for(int j = 0; j < 5; j++)
            {
                if(hand.get(j).getValue()==2)
                {
                    twos++;
                }
            }
        for(int j = 0; j < 5; j++)
            {
                if(hand.get(j).getValue()==3)
                {
                    threes++;
                }
            }
            for(int j = 0; j < 5; j++)
            {
                if(hand.get(j).getValue()==4)
                {
                    fours++;
                }
            }
            for(int j = 0; j < 5; j++)
            {
                if(hand.get(j).getValue()==5)
                {
                    fives++;
                }
            }
            for(int j = 0; j < 5; j++)
            {
                if(hand.get(j).getValue()==6)
                {
                    sixes++;
                }
            }
            if((ones==3||twos==3||threes==3||fours==3||fives==3||sixes==3) && (ones==2||twos==2||threes==2||fours==2||fives==2||sixes==2))
            {
                finalVal = 25;
            }
            scorecard.put("full house", finalVal);
        }
}