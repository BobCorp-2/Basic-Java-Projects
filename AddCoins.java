import hsa.Console;
import java.text.DecimalFormat;
// The "AddCoins" class.
public class AddCoins
{
    static Console c;
    static DecimalFormat f = new DecimalFormat("##.00");
    public static double quart(double quarters){
	return(quarters*0.25);
    }
    
    public static double dim(double dimes){
	return(dimes*0.10);
    }
    
    public static double nick(double nickels){
	return(nickels*0.05);
    }
    
    public static double pen(double pennies){
	return(pennies*0.01);
    }
    
    public static void main (String[] args)
    {
	c = new Console();
	double quarters;
	double dimes ;
	double nickels;
	double pennies;
	double total;
	c.println("Enter your total coins: ");
	c.println("Quarters: ");
	quarters = c.readDouble();
	c.println("Dimes: ");
	dimes = c.readDouble();
	c.println("Nickels: ");
	nickels = c.readDouble();
	c.println("Pennies: ");
	pennies = c.readDouble();
	total = (quart(quarters) + dim(dimes) + nick(nickels) + pen(pennies));
	c.print("$" + f.format(total));
	// Place your code here
    } // main method
} // AddCoins class

