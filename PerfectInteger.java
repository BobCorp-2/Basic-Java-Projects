import hsa.Console;
// The "PerfectInteger" class.
public class PerfectInteger
{
    static Console c;
    public static void main(String[] args){
	int min = 1; 
	int max = 100;
	c = new Console();
	for (min = 1; min <= max; min++) { 
	    int sum = 0;
	    for (int e = 1; e < min; e++) {
		if ((min % e) == 0) {
		    sum += e;
		} 
	    }  
	    if (sum == min){           
		c.println(sum);
	    }          
	}      
    } 
	
}      

