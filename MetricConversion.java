import hsa.Console;
// The "MetricConversion" class.
public class MetricConversion
{
    static Console c;
    public static double IC (double num){
	num = (num * 2.54);
	return(num);
    }
    public static double FC (double num){
	num = (num * 30.48);
	return(num);
    }
    public static double YM (double num){
	num = (num * 0.9144);
	return(num);
    }
    public static double MK (double num){
	num = (num * 1.60934);
	return(num);
    }
    public static double CI (double num){
	num = (num * 0.393701);
	return(num);
    }
    public static double CF (double num){
	num = (num * 0.0328084);
	return(num);
    }
    public static double MY (double num){
	num = (num * 1.09361);
	return(num);
    }
    public static double KM (double num){
	num = (num * 0.621371);
	return(num);
    }
    public static void main (String[] args)
    {
	c = new Console();
	double num;
	double num1 = 1;
	int choice;
	c.print("Enter a number: ");
	num = c.readInt();
	c.print("Convert: \n 1. Inches to Centimeters    5. Centimeters to Inches  \n 2. Feet to Centimeters      6. Centimeters to Feet  \n 3.Yards to Meters           7. Meters to Yards \n 4. Miles to Kilometers      8. Kilometers to Miles \n Enter your choice: ");
	choice = c.readInt();
	if (choice == 1){
	    num1 = IC(num);
	    c.print(num + " inches equals " + num1 + " centimeters");
	}else if (choice == 2){
	    num1 = FC(num);
	    c.print(num + " feet equals " + num1 + " centimeters");
	}else if (choice == 3){
	    num1 = YM(num);
	    c.print(num + " yards equals " + num1 + " meters");
	}else if (choice == 4){
	    num1 = MK(num);
	    c.print(num + " miles equals " + num1 + " kilometers");
	}else if (choice == 5){
	    num1 = CI(num);
	    c.print(num + " centimeters equals " + num1 + " inches");
	}else if (choice == 6){
	    num1 = CF(num);
	    c.print(num + " centimeters equals " + num1 + " feet");
	}else if (choice == 7){
	    num1 = MY(num);
	    c.print(num + " meters equals " + num1 + " yards");
	}else if (choice == 8){
	    num1 = KM(num);
	    c.print(num + " kilometers equals " + num1 + " miles");
	}else 
	    c.print("Please choose a conversion from 1 to 8 ");
	// Place your code here
    } // main method
} // MetricConversion class


