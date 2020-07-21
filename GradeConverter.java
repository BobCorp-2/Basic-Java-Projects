import hsa.Console;
public class GradeConverter {
    
    static Console c;
    public static boolean isValidNumber(int userNum, int minNum, int maxNum) {
	if (minNum <= userNum && userNum <= maxNum) {
	    return(true);
	} else {
	    return(false);
	}
    }
/**
* Determines the letter grade that corresponds to the numeric grade.
* pre: 0 <= numGrade <= 100
* post: The letter grade A, B, C, D, or F has been returned.
*/
    public static String getLetterGrade(int numGrade) {
	if (numGrade < 60) {
	    return("F");
	} else if (numGrade < 69){
	    return("D");
	} else if (numGrade < 70){
	    return("D+");
	} else if (numGrade < 79) {
	    return("C");
	} else if (numGrade < 80) {
	    return("C+");
	} else if (numGrade < 89) {
	    return("B");
	} else if (numGrade < 90) {
	    return("B+");
	} else if (numGrade < 100) {
	    return("A");
	} else 
	    return("A+");
    }


    public static void main(String[] args) {
	c = new Console();
	final int FLAG = -1;
	final int minValue = 0;
	final int maxValue = 100;
	int numericGrade;
	String letterGrade;
	

	c.print("Enter a numeric grade (-1 to quit): ");
	numericGrade = c.readInt();
	while (numericGrade != FLAG) {
	    if (isValidNumber(numericGrade, minValue, maxValue)) {
		letterGrade = getLetterGrade(numericGrade);
		c.println("The grade " + numericGrade + " is a(n) " + letterGrade + ".");
	    } else {
		c.println("Grade entered is not valid.");
	    }
	    c.print("Enter a numeric grade (-1 to quit): ");
	    numericGrade = c.readInt();
	}
    }
}

