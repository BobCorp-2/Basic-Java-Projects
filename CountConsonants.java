import hsa.Console;
// The "CountConsonants" class.
public class CountConsonants
{
    static Console c;
    public static void main (String[] args)
    {
	c = new Console();
	String sentence;
	int con = 0;
	
	String[] consonants = { "B", "C", "D", "F", "G", "H", "J", "K", "L", "M", "N", "P", "Q", "R", "S", "T", "V", "X", "Z", "W", "Y", "b", "c", "d", "f", "g", "h", "j", "k", "l", "m", "n", "p", "q", "r", "s", "t", "v", "x", "z", "w", "y"};
	c.print("Enter text: ");
	sentence = c.readLine();
	
	String[] text = sentence.split("");
	
	for(int p = 1; p < text.length; p++){
	    
	    for (int i = 0; i < consonants.length; i++){
		
		
		if ((text[p]).equals(consonants[i])){
		    con = con + 1;
		}
		
		
	    }
	 }
	c.print("The number of consonants in < " + sentence + " > is " + con); 
	// Place your code here
    } // main method
} // CountConsonants class
