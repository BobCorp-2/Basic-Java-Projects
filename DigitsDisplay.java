import hsa.Console;
// The "DigitsDisplay" class.
public class DigitsDisplay
{
    static Console c;
    public static void main (String[] args)
    {
	c = new Console();
	String integer;
	char [] integerNumbers;
	c.print("Enter a positive integer: ");
	integer = c.readString();
	integerNumbers = integer.toCharArray();
	
	for (int ch = 0; ch < integerNumbers.length; ch++ ){
	    c.println(integerNumbers[ch]);
	}
	// Place your code here
    } // main method
} // DigitsDisplay class

