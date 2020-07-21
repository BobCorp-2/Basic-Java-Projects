import hsa.Console;
// The "Coder" class.
public class Coder
{
    static Console c;
    public static void main (String[] args)
    {
	c = new Console();
	
	String[] Alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j","k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
	String[] newtext;
	
	String Scramble;
	c.print("Please enter the secret message you want to scramble (lowercase): ");
	Scramble = c.readLine();
	String[] text = Scramble.split("");
	newtext = new String [text.length];
	for (int i = 0; i < text.length; i++){
	    for ( int p = 0; p < Alphabet.length; p++){
		String A = text[i];
		String B = Alphabet[p];
		int C = (p + 2);
	    
		if ((A).equals("y")){
		    newtext[i] = "a";
		}
		else if((A).equals("z")){
		    newtext[i] = "b";
		}
		else if((A).equals(" ")){
		    newtext[i] = " ";
		}
		    
		else if((A).equals (B)){
		    newtext[i] = (Alphabet[C]);
		    
		}
	    }
	}
	for (int j = 1; j < newtext.length; j++){
	    c.print(newtext[j]);
	}   
		    
	// Place your code here
    } // main method
} // Coder class
