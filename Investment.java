import hsa.Console;
import java.text.DecimalFormat;
// The "Investment" class.
public class Investment
{   
    static Console c;
    
    public static void main (String[] args)
    {
	
	c = new Console();
	DecimalFormat df = new DecimalFormat("#.##");
	double inv;
	int goal;
	int year = 0;
	c.print("Please input the investment amount ");
	inv = c.readDouble();
	c.print("Now please input the goal amount for your investment ");
	goal = c.readInt();
	while (inv < goal) {
	    inv = inv * 1.075 ;
	    year += 1;
	    }
	
	c.print("It will take " + year + " years for your investment to be worth more than " + goal + " dollars! By then you will have " + (df.format(inv)) + " dollars !");
	
	// Place your code here
    } // main method
} // Investment class
