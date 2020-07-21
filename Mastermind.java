import hsa.Console;
import java.util.Random;
// The "Mastermind" class.
public class Mastermind
{
    static Console c;
    public static void main (String[] args)
    {
	c = new Console();
	Random rand = new Random();
	int peg;
	int color;
	int color1;
	int color2;
	int color3;
	int color4;
	int color5;
	int color6;
	int color7;
	int color8;
	int color9;
	int colors = 0;
	String guess;
	int tryguess = 1;
	int pegs = 0;
	int tries = 0;
	boolean game = true;
	int pegguess;
	c.println("Enter the number of pegs <1-10>:");
	peg = c.readInt();
	c.println("Enter the number of colors <1-9>:");
	color = c.readInt();
	int[] code = new int [peg];
	for(int o = 0; o < peg ; o++){
	    int  n = rand.nextInt(color) + 1;
	    code[o] = n;
	}
	
	while (game == true){
	    c.println("Guess " + tryguess + ":");
	    pegs = 0;
	    colors = 0;
	    color1 = 0;
	    color2 = 0;
	    color3 = 0;
	    color4 = 0;
	    color5 = 0;
	    color6 = 0;
	    color7 = 0;
	    color8 = 0;
	    color9 = 0;
	    for(int o = 0; o < peg; o++){
		c.println("Color for peg " + (o + 1) + ": ");
		pegguess = c.readInt();
		if (pegguess == code[o]){
		    pegs += 1;
		}
		for (int g = 0; g < (peg); g++){
		    if (pegguess == code[g]){
			if (pegguess == 1){
			    color1 = 1;
			} 
			if (pegguess == 2){
			    color2 = 1;
			} 
			if (pegguess == 3){
			    color3 = 1;
			} 
			if (pegguess == 4){
			    color4 = 1;
			} 
			if (pegguess == 5){
			    color5 = 1;
			} 
			if (pegguess == 6){
			    color6 = 1;
			} 
			if (pegguess == 7){
			    color7 = 1;
			} 
			if (pegguess == 8){
			    color8 = 1;
			} 
			if (pegguess == 9){
			    color9 = 1;
			} 
		    } 
		 
		}if (pegs == peg){
		    game = false;
		}     
	    }
	    colors = (color1+color2+color3+color4+color5+color6+color7+color8+color9);
	    c.println("You have " + pegs + " pegs<s> correct and " + colors + " color<s> correct.");                 
	    tries += 1;
	    
	}
	c.println("You have broken the code in " + tries + " guesses.");
	// Place your code here
    } // main method
} // Mastermind class

