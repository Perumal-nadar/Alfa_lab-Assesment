package alfaLab_Assesment;
//3. Ask user to enter a student name and print ""present"" if name is in array.

import java.util.Scanner;

public class Q_no_3 {
	
public static void main(String[] args) {
		
		int i,size,k=0,a ;
		String b=" ";
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the size");
		size = sc.nextInt();
		
		System.out.println("Enter the Student Name");
		
		String [] student_name=new String [size];
		
		for(i=0;i<size;i++) {
			student_name[i]=sc.next();

		}
		
		System.out.println("Enter the name to be search");
		String name=sc.next();
		
		for(i=0;i<size;i++) {
			if(student_name[i].equals(name)) {
				k=1;
				a=i;
			 b=student_name[i];
			}
		}
		if(k==1) {
			System.out.println( b +" Present ");
		}
		else {
			System.out.println("Unable to find the name!");
		}

	}


}
