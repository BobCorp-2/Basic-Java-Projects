
import hsa.Console;
// The "PythagoreanTriplets" class.
public class PythagoreanTriplets
{
     static Console c;
     public static void main(String[] args) {
	c = new Console();
	int sum = 0;

	for (int num1 = 1; num1 <= 100; num1++) {
	    for (int num2 = 1; num2 < 100; num2++) {
		if (PerfectSquare(num1, num2, sum)) {
		    c.println(num1 + " " + num2);
		}
	    }
	}
    }

    public static boolean PerfectSquare(int number1, int number2, int sum) {

	int square1;
	int square2;
	double root;
	int sum1;

   

	square1 = (int) Math.pow(number1, 2.0);
	square2 = (int) Math.pow(number2, 2.0);
	sum = square1 + square2;
	root = (int)Math.sqrt(sum);
	sum1 = (int) Math.pow(root, 2.0);

	if (!(sum == sum1)) {
	    return false;
	}

	return true;
    } // main method
} // PythagoreanTriplets class

