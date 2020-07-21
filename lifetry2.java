import hsa.Console;

// The "lifetry2" class.
public class lifetry2
{
    static Console c;
    public static void main (String[] args)
    {
	c = new Console(30,100);
	int game = 1;
	int [] [] life = new int [20][20];
	int [] [] life2 = new int [20][20];
	int cells = 0;
	int celrow = 0;
	int celcol = 0;
	for (int row1 = 0; row1 < life.length; row1++){
	    for (int col1 = 0; col1 < life.length; col1++){            
		life[row1][col1] = 0;
	    }
	}
	for (int row1 = 0; row1 < life.length; row1++){
	    for (int col1 = 0; col1 < life.length; col1++){            
		life2[row1][col1] = 0;
	    }
	}
	
	for (int row2 = 0; row2 < life.length; row2++){
		    c.println();
		    for (int col2 = 0; col2 < life.length; col2++){            
			c.print(life[row2][col2]);
		    }
	}
	c.println();
	c.println("Please input the amount of living cells you would like to have on the first day: ");
	cells = c.readInt();
	for (int u = 0; u < cells; u++){
	    c.println("Please input the row of cell number " + (u+1));
	    celrow = c.readInt();
	    c.println("Please input the colum of cell number " + (u+1));
	    celcol = c.readInt();
	    life [celrow - 1] [celcol - 1] = 1;
	} 
	for (int row2 = 0; row2 < life.length; row2++){
		    c.println();
		    for (int col2 = 0; col2 < life.length; col2++){            
			if (life[row2][col2] == 1){
			    c.print("X");
			}else{
			    c.print("0");
			}
		    }
	}
	while (game == 1){
	    for (int row = 0; row < 20; row++){
		for (int col = 0; col < 20; col++){
		    int nei = 0;
		    if ((col > 0 && row > 0)&&(col < 19 && row < 19)){
			if (life[row - 1][col - 1] == 1) {
			    nei += 1;
			}
			if (life[row - 1][col] == 1) {
			    nei += 1;
			}
			if (life[row - 1][col + 1] == 1) {
			    nei += 1;
			}
			if (life[row][col - 1] == 1) {
			    nei += 1;
			}
			if (life[row][col + 1] == 1) {
			    nei += 1;
			}
			if (life[row + 1][col - 1] == 1) {
			    nei += 1;
			}
			if (life[row + 1][col] == 1) {
			    nei += 1;
			}
			if (life[row + 1][col + 1] == 1) {
			    nei += 1;
			}
			
			if (life [row] [col] == 1)    
			    if (nei == 2 || nei == 3){
				life2 [row] [col] = 1;
			    }
			    
			    else{
				life2 [row] [col] = 0;
			    }
		    
			if ((life [row] [col]) == 0){
			    
			
			    
			       if (nei == 3){
				    life2 [row] [col] = 1;
				}
				else{
				    life2 [row] [col] = 0;
				}
			
		    }
		    }
		}
	    }
	    c.println();
	    c.println("Would you like to generate the next world?(yes = 1/no = 0)");
	    game = c.readInt();
	    if (game == 1){
		for (int row2 = 0; row2 < life.length; row2++){
		    c.println();
		    for (int col2 = 0; col2 < life.length; col2++){            
			if (life2[row2][col2] == 1){
			    c.print("X");
			}else{
			    c.print("0");
			} 
		    }
		}
		for (int row2 = 0; row2 < life.length; row2++){
		    
		    for (int col2 = 0; col2 < life.length; col2++){            
			life[row2][col2] = life2[row2][col2];
		    }
		}
	}
	// Place your code here
    } 
    }// main method
} // lifetry2 class
