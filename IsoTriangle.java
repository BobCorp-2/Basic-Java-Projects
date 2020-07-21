
import hsa.Console;

// The "IsoTriangle" class.
public class IsoTriangle
{
    static Console c;
  
    
    public static void main (String[] args)
    {
	c = new Console();
	int size;
	int h = 1;
	int q = 1;
	int p = 0;
	int l = 30;
	int o = 1;
	int t = 30;
	c.print("Enter the size: ");
	size = c.readInt();
	for( int i = 1; i != size; i++){
	    while (o < l){
		c.print(" ");
		l -= 1;
	    }
	    while (p != q){
		c.print("*");
		p += 1;
	    }
	    c.println();
	    q += 2;
	    p = 0;
	    t -= 1;
	    l = t;
	} 
	
	// Place your code here
    } // main method
} // IsoTriangle class

