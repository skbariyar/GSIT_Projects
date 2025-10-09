package firstpackage;

public class MarksCalculator {
	    public static void main(String[] args) {
//	        1. Store marks of 3 subjects
	        int math = 85;
	        int science = 12;
	        int english = 15;

//	        2. Calculate total marks using arithmetic operators
	        int total = math + science + english;

//	        3. Calculate average marks using a suitable data type (double)
	        double average = total / 3.0;

//	        4. Print both total and average
	        System.out.println("Marks in Math: " + math);
	        System.out.println("Marks in Science: " + science);
	        System.out.println("Marks in English: " + english);
	        System.out.println("Total Marks: " + total);
	        System.out.println("Average Marks(as double): " + average);

//	        5. Change the data type of average variable - here using int
	        int averageInt = total / 3;
	        System.out.println("Average marks (as int): " + averageInt);
	        
//	        6. Change the data type of average variable - here using byte
//	        byte averageByte = total / 3;
//	        System.out.println("Average marks (as byte): " + averageByte);

//	        7. Change the data type of average variable - here using short
//	        short averageShort = total / 3;
//	        System.out.println("Average marks (as short): " + averageShort);
	        
//	        8. Change the data type of average variable - here using long
	        long averageLong = total / 3;
	        System.out.println("Average marks (as long): " + averageLong);	
	        
//	        9. Change the data type of average variable - here using float
	        float averageFloat = total / 3;
	        System.out.println("Average marks (as float): " + averageFloat);
	        
//	        10. Change the data type of average variable - here using char
//	        char averageChar = total / 3;
//	        System.out.println("Average marks (as Char): " + averageChar);
	        
//	        11. Checking Students passed or not in Math - here using boolean
	        boolean passInMath = (math >= 33);
	        System.out.println("Passed in Math (Using Boolean): " +passInMath);
	        
//	        12. Checking Students passed or not in Science - here using boolean
	        boolean passInScience = (science >= 33);
	        System.out.println("Passed in Science (Using Boolean): " +passInScience);
	        
//	        13. Checking Students passed or not in English - here using boolean
	        boolean passInEnglish = (english >= 33);
	        System.out.println("Passed in English (Using Boolean): " +passInEnglish);
	        
//	        14.Printing Pass if student is pass - here using char error is coming, need to ask
//	        char grade = (average >= 90);
//	        System.out.println("GRADE A: " +grade);
	        
	        
	        
	        
	        
	        
	        
	        // Note the difference:
	        // Using double retains the decimal points, giving a more accurate average,
	        // while using int truncates the value, losing fractional precision.
	    }
	}

