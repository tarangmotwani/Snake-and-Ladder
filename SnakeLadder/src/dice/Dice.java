package dice;

public class Dice {
    int MIN = 1;
    int MAX = 6;

    public int diceRoll() {
        
        //random fn generates a 
        double d = (Math.random() * (MAX-MIN)) + MIN;
        return (int)d;
    }
}
