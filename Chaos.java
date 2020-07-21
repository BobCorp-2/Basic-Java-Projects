import hsa.Console;
// The "Chaos" class.
public class Chaos
{
    static Console c;
    public static void main (String[] args)
    {
	c = new Console();
	int x;
	double y = 0.5;
	c.print("Please input a number for the chaos experiment: ");
	x = c.readInt();
	for( int i = 0; i < 50; i ++){
	    x = 2*x*(1-x);
	    c.println(x);
	    
	}
	c.print("Please input a number between 2 - 4 for another chaos experiment: ");
	x = c.readInt();
	for( int i = 0; i < 50; i ++){
	    y = y*0.5*(1-y);
	    c.println(y);
	    
	}
	
	// Place your code here
    } // main method
} // Chaos class





