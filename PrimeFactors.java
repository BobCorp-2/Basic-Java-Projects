
// The "PrimeFactors" class.
import hsa.Console;

public class PrimeFactors
{
    static Console c;           // The output console
    
    public static void main (String[] args)
    {
	c = new Console();
	int num;
	int counter = 2;

	c.println("Enter a number you want the prime factors for: ");
	num = c.readInt();
	c.println("Prime Factors of " + num );
	while(counter <= num){
	
	    if (num % counter == 0){
		c.println(counter);
		num = (num / counter);
	    }
		
	    else{
	    counter++;
	    }
	    
	}
		
	
	
	
	
	// Place your program here.  'c' is the output console
    } // main method
} // PrimeFactors class

