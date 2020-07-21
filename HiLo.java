import hsa.Console;
import java.util.Random;
// The "HiLo" class.
public class HiLo
{
    static Console c;
    public static void main (String[] args)
    {
	c = new Console();
	Random rand = new Random();
	int risk = 0;
	int pred;
	String rep;
	int total = 1000;
	boolean play = true;
	c.println("HIGH LOW GAME");
	c.println("RULES");
	c.println("Numbers 1 through 6 are low");
	c.println("Numbers 8 through 13 are high");
	c.println("Number 7 is neither high or low");
	c.println();
	while (play = true){ 
	    int  n = rand.nextInt(13) + 1;
	    c.println("You have " + (total+risk) + " points.");
	    c.println("Enter points to risk");
	    risk = c.readInt();
	    total = (total - risk);
	    c.println("Predict <1=High, 0=Low>:");
	    pred = c.readInt();
	    c.println("Number is " + n );
	    if (pred == 1 && n > 7){
		c.println("You win!");
		risk = risk*2;
		c.println("Play again?");
		rep = c.readString();
		if (rep == "n")
		    play = false; 
		
	    }if (pred == 0 && n < 7){
		c.println("You win!");
		risk = risk*2;
		c.println("Play again?");
		rep = c.readString();
		if (rep == "n")
		    play = false; 
		    
	    }else if (pred == 1 && n < 7){
		c.println("You lost!");
		risk =risk/2;
		c.println("Play again?");
		rep = c.readString();
		if (rep == "n")
		    play = false; 
	    
	    }else if (pred == 0 && n > 7){
		c.println("You lost!");
		risk = risk/2; 
		c.println("Play again?");
		rep = c.readString();
		if (rep == "n")
		    play = false; 
	     }
	     }
	// Place your code here
    } // main method
} // HiLo class



