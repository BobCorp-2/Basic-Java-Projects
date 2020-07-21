import hsa.Console;
// The "Inventory" class.
public class Inventory
{
    static Console c;
    
	
    public static void main (String[] args)
    {
	c = new Console(25,150);
	int[] stock_number = new int [10000];
	int choice = 0;
	int find = 0;
	int items = 5;
	int discontinue = 0;
	String nw_stock;
	int nw_stock_number;
	String[] stock_name = new String [10000];
	String game = "no";
	int[] stock_amount = new int [10000];
	String[] stock_contin = new String [10000];
	for (int k = 0; k < items; k++){
	    stock_number[k] = (1001 + k);
	}  
	stock_name [0] = "Shoes";
	stock_name [1] = "Baseballs";
	stock_name [2] = "Pants";
	stock_name [3] = "Phones";
	stock_name [4] = "Bananas";
	
	stock_amount [0] = 2021;
	stock_amount [1] = 2183;
	stock_amount [2] = 5945;
	stock_amount [3] = 3895;
	stock_amount [4] = 12349;
	
	for( int o = 0; o < items; o++){
	    c.print("#" + stock_number[o]);
	    c.println(" "+stock_name[o]);
	    
	
	} 
	for( int d = 0; d < items; d++){
	    stock_contin [d] = ("");
	} 
	while (!game.equals("complete")){
	    c.print("What action would you like to complete? (add item(1), discontinue item(2), display stock for an item(3))");
	    choice = c.readInt();
	    if (choice == 1){
		c.print("What would you like to name this item?");
		nw_stock = c.readString();
		
		items += 1;
		for (int k = 0; k < items; k++){
		    stock_number[k] = (1001 + k);
		}  
		stock_name[(items -1)] = nw_stock;
		c.print("How many of these items are in stock?");
		nw_stock_number = c.readInt();
		stock_amount[(items-1)] = nw_stock_number;
		stock_contin[items -1] = ("");
		c.println("Thank you! These items have been added");
		for( int o = 0; o < items; o++){
		    c.print("#" + stock_number[o]+" "+stock_name[o]);
		    
		    c.println(" "+stock_contin[o]);
	
		}
	    }
	    else if (choice == 2){
		c.print("What item would you like to discontinue?(Please insert item number)"); 
		discontinue = c.readInt();
		stock_contin[(discontinue - 1001)] = "DISCONTINUED";
		stock_amount[(discontinue - 1001)] = 0;
		c.println("Thank you! These changes have been made");
		for( int o = 0; o < items; o++){
		    c.print("#" + stock_number[o]);
		    c.print(" "+stock_name[o]);
		    c.println(" "+stock_contin[o]);
		    
		    
	
		}
		
	    }
	    else if (choice == 3){
		c.print("What item would you like to see the stock of?(Please insert item number)");
		find = c.readInt();
		c.print("#" + stock_number[find - 1001]);
		c.print(" "+stock_name[find - 1001]);
		c.println(" "+stock_contin[find - 1001]);
		c.println("Stock: " + stock_amount[find - 1001]);
		
	    }
		
       }
	// Place your code here
    } // main method
} // Inventory class



