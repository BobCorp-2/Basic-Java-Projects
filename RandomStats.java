import hsa.Console;
import java.util.Random;
// The "RandomStats" class.
public class RandomStats
{
    static Console c;
    public static void main (String[] args)
    {
	c = new Console();
	int x = 0;
	int p = 0;
	int p1 = 0;
	int p2 = 0;
	int p3 = 0; 
	int p4 = 0;
	int p5 = 0;
	int p6 = 0;
	int p7 = 0;
	int p8 = 0;
	int p9 = 0;
	Random rand = new Random();
	int[] numbers = new int [500];
	
	while (x < 500){
	    int  n = rand.nextInt(10);
	    numbers[x] = n;
	    x += 1;
	}
	c.println ("Number     Occurrences");
	c.print("0");
	for(int i = 0; i < 500;i++){
	    
	    if ((numbers[i]) == 0){
		p +=1;
	    }
	} 
	c.println("           " + p); 
	c.print("1");
	for(int i = 0; i < 500;i++){
	    
	    if ((numbers[i]) == 1){
		p1 +=1;
	    }
	} 
	c.println("           " + p1);
	c.print("2");
	for(int i = 0; i < 500;i++){
	    
	    if ((numbers[i]) == 2){
		p2 +=1;
	    }
	} 
	c.println("           " + p2); 
	c.print("3");
	for(int i = 0; i < 500;i++){
	    
	    if ((numbers[i]) == 3){
		p3 +=1;
	    }
	} 
	c.println("           " + p3);
	c.print("4");
	for(int i = 0; i < 500;i++){
	    
	    if ((numbers[i]) == 4){
		p4 +=1;
	    }
	} 
	c.println("           " + p4); 
	c.print("5");
	for(int i = 0; i < 500;i++){
	    
	    if ((numbers[i]) == 5){
		p5 +=1;
	    }
	} 
	c.println("           " + p5);
	c.print("6");
	for(int i = 0; i < 500;i++){
	    
	    if ((numbers[i]) == 6){
		p6 +=1;
	    }
	} 
	c.println("           " + p6);
	c.print("7");
	for(int i = 0; i < 500;i++){
	    
	    if ((numbers[i]) == 7){
		p7 +=1;
	    }
	} 
	c.println("           " + p7);
	c.print("8");
	for(int i = 0; i < 500;i++){
	    
	    if ((numbers[i]) == 8){
		p8 +=1;
	    }
	} 
	c.println("           " + p8);
	c.print("9");
	for(int i = 0; i < 500;i++){
	    
	    if ((numbers[i]) == 9){
		p9 +=1;
	    }
	} 
	c.print("           " + p9);
	  
	// Place your code here
    } // main method
} // RandomStats class


