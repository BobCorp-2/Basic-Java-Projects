import hsa.Console;
import java.util.Random;

// The "Nim" class.
public class Nim
{
    static Console c;
    static Random rand = new Random();
    public static void main (String[] args)
    {
	
	c = new Console();
	int  n = rand.nextInt(30) + 20;
	int like;
	while (n >= 0){
	    int p = rand.nextInt(3) + 1;
	    c.println("There are " + n + " stones.");
	    c.println("How many would you like?");
	    like = c.readInt();
	    while (like > 3){
		c.println("Please input a number between 1 and 3");
		like = c.readInt();
	    }
	    n -= like;
	    if (n == 0){
		c.println("There are 0 stones left!");
		c.println("The computer wins!");
		break;
	    }
	    c.println("There are " + n + " stones.");
	    if (p > 1 )
		c.println("The computer takes " + p + " stones.");
	    else 
		c.println("The computer takes " + p + " stone.");
	    n -= p;
	    if (n == 0){
		c.println("There are 0 stones left!");
		c.println("The player wins!");
		break;
	    }     
	 }   
	// Place your code here
    } // main method
} // Nim class

