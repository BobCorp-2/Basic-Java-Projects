import hsa.Console;
import java.util.Random;

// The "GuessingGame" class.
public class GuessingGame
{
    static Console c;
    static Random rand = new Random();
    
    static int give;
    static int n = rand.nextInt(20)+1;
    public static void highlow(int guess){
    
	if (guess > n){
	    give = 1;
	}
	else if (guess < n){
	    give = 0;
	}
	else if (guess == n){
	    give = 2;
	}
    }
    public static void main (String[] args)
    {
	c = new Console();
	int guess = 100;
	
	
	while (guess != n){
	    
	    
	    c.print("Enter a number between 1 and 20:");
	    guess = c.readInt();
	    highlow(guess);
	    if (give == 1){
		c.print("Hint: try a lower number. ");
	    }
	    if (give == 2){
		c.print("You Won!");
		break;
	    }
	    if (give == 0){
		c.print("Hint: try a higher number. ");
	    }
	// Place your code here
     } // main method
}
} // GuessingGame class

