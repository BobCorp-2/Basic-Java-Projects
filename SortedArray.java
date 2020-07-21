import hsa.Console;
import java.util.Random;
// The "SortedArray" class.
public class SortedArray
{
    static Console c;
    public static void main (String[] args)
    {
	c = new Console();
	int nums;
	int[] unsorted_nums;
	int[] sorted_nums;
	Random rand = new Random();
	int o = 0;
	
	c.print("Enter the number of values you want: ");
	nums = c.readInt();
	unsorted_nums = new int[nums];
	sorted_nums = new int[nums];
	for (int i = 0; i < (nums); i++){
	    int  n = rand.nextInt(100) + 1;
	    unsorted_nums [i] = n;
	    c.println(n);
	}
	for (int j = 0; j < 101; j++){
	    for (int h = 0; h < (nums); h++){
		if ((unsorted_nums[h])==(j)){
		    sorted_nums[o] = unsorted_nums[h];
		    o += 1;
		}
	    }
	}
	
       c.println("Sorted"); 
       for (int g = 0; g < nums; g++){
	    c.println(sorted_nums[g]);
	}        
	// Place your code here
    } // main method
} // SortedArray class


