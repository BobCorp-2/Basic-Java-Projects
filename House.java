import hsa.Console;
// The "House" class.
public class House
{
    static Console c;
    
    public static String addRoof(){
	return("    /\\  \n   /  \\  \n  /    \\  \n /______\\ ");
    }
    
    public static String addBase(){
       
	return("\n|        | \n|        | \n|________|");
    }
    
    public static String addWalk(){
	
	
	return("\n   **    \n   **********");
	
    }
	
    public static void main (String[] args)
    {   
	c = new Console();
	String roof;
	String base;
	String walk;
    
	roof = addRoof();
	base = addBase();
	walk = addWalk();
	c.print(roof);
	c.print(base);
	c.print(walk);
	
	// Place your code here
    } // main method
} // House class
