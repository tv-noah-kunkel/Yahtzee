import java.util.ArrayList;
import java.lang.Math;   

public class Die {
    
    private int value;

    public void roll()
    {
        value = (int) ((Math.random()*6) + 1);
    }

    public int getValue()
    {
        int x = 1;
        return value;
    }


}


