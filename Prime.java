import hsa.Console;
// The "Prime" class.
public class Prime
{
    static Console c;
    public static void main (String[] args)
    {
	c = new Console ();
	int temp;
	boolean isPrime=true;
	
	c.print("Enter any number:");
	//capture the input in an integer
	int num = c.readInt();
	for(int i=2;i<=num/2;i++)
	{
	   temp=num%i;
	   if(temp==0)
	   {
	      isPrime=false;
	      break;
	   }
	}
	//If isPrime is true then the number is prime else not
	if(isPrime)
	   c.print(num + " is a Prime Number");
	else
	   c.print(num + " is not a Prime Number");
   }

	// Place your code here
     // main method
}
    // Prime class
