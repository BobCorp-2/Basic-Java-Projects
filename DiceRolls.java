import hsa.Console;
import java.util.Random;

// The "DiceRolls" class.
public class DiceRolls
{
    static Console c;
    public static void main (String[] args)
    {
	c = new Console();
	Random rand = new Random();

	c.println("Dice 1     Dice 2      Total ");
	for (int i = 0; i < 5; i ++){
	    int  n = rand.nextInt(6) + 1;
	    int  m = rand.nextInt(6) + 1;
	    c.println("     " + n + "          " + m + "          " + (m+n));
	    
	}


	// Place your code here
    } // main method
} // DiceRolls class


