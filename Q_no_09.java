package alfaLab_Assesment;
//9. write a program print age of user after getting date of birth from them
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Q_no_09 {

	public static void main(String[] args) {
		
		
		 
		System.out.print("Enter date of birth in YYYY-MM-DD format: ");  
		Scanner scanner = new Scanner(System.in);  
		// take date of birth from user 
		String input = scanner.nextLine();  
		scanner.close();  
		//the parse() method for format
		LocalDate dob = LocalDate.parse(input);  
	
		System.out.println("You are " + calculateAge(dob)+" years old."); //prints the age  
		}  
		
		public static int calculateAge(LocalDate dob)   //the method calculates the age  
		{  
		    
		LocalDate curDate = LocalDate.now();  
		//calculates the time between two dates and return years  
		if ((dob != null) && (curDate != null))   
		{  
		return Period.between(dob, curDate).getYears();  
		}  
		else  
		{  
		return 0;  
		}  
	}

}
