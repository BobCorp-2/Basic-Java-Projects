import hsa.Console;
import java.util.Random;

// The "EvensAndOdds" class.
public class EvensAndOdds
{
    static Console c;
    public static void main (String[] args)
    {
	c = new Console();
	int x= 0;
	Random rand = new Random();
	int[] numbers = new int [25];
	
	while (x < 25){
	    int  n = rand.nextInt(99);
	    numbers[x] = n;
	    x += 1;
	}
	c.println("Even:");
	for(int i = 0; i < 25;i++){
	    
	    if ((numbers[i] % 2) == 0){
		c.print(" " + numbers[i]);
	    }
	}  
	c.println();
	c.println("Odd:");
	for(int i = 0; i < 25;i++){
	    
	    if ((numbers[i] % 2) == 1){
		c.print(" " + numbers[i]);
	    }
	} 
	// Place your code here
    } // main method
} // EvensAndOdds class


