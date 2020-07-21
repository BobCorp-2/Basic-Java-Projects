import hsa.Console;
import java.lang.Math;
// The "ElapsedTimeCalculator" class.
public class ElapsedTimeCalculator
{
    static Console c;
    public static void main (String[] args)
    {
	c = new Console();
	int startinghour;
	int elapsed;
	String amorpm;
	c.print("Enter the starting hour: ");
	startinghour = c.readInt();
	c.print("Enter am or pm: ");
	amorpm = c.readString();
	c.print("Enter the number of elapsed hours: ");
	elapsed = c.readInt();
	
	if (elapsed + startinghour > 12 && elapsed + startinghour < 24 ){
	    
	    
	    if (amorpm.equals("am") && ((elapsed + startinghour) % 12) != 0){  
		c.print("The time is : " + ((elapsed + startinghour) % 12) + ":00 pm");
	    }
	    else if (amorpm.equals("pm") && ((elapsed + startinghour) % 12) != 0){  
		c.print("The time is : " + ((elapsed + startinghour) % 12) + ":00 am");
	    }
	    
       
	} 
	
	else if ((elapsed % 12) != 0){
	    if (Math.floor((elapsed + startinghour) / 12 )%2 == 0){ 
	
		if (((elapsed + startinghour) % 12) != 0){
		c.print("The time is : " + ((elapsed + startinghour) % 12) + ":00 " + amorpm );
		}
	    
		else{
		    c.print("The time is : " + startinghour + ":00 " + amorpm );
		}
	    }  
	    else if (Math.floor((elapsed + startinghour) / 12 )%2 == 1){
		if (amorpm == "am"){  
		    c.print("The time is : " + ((elapsed + startinghour) % 12) + ":00 pm");
		}
		else if (amorpm == "pm"){  
		    c.print("The time is : " + ((elapsed + startinghour) % 12) + ":00 am");
		}
	    }  
	}
	else if (((elapsed/ 12)%2) == 0){
	    c.print("The time is : " + startinghour + ":00 " + amorpm);
	}
	else if (((elapsed/ 12)%2) == 1){
	    if (amorpm.equals("am")){  
		c.print("The time is : " + startinghour + ":00 pm");
	    }
	    else if (amorpm.equals("pm")){  
		c.print("The time is : " + startinghour + ":00 am");
	    }
	}
	
	
	// Place your code here
    } // main method
} // ElapsedTimeCalculator class


