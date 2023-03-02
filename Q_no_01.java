package alfaLab_Assesment;
//1.Read list of 10 students from a text file and store it in an array:

import java.util.Scanner;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Q_no_01 {

public static void main(String[] args) throws Exception{
			
		List<String> names = new ArrayList<String>();
		
		Scanner sc = new Scanner(new FileReader("C:\\Users\\shiva\\Desktop\\names.txt"));
		String st;
		
		 while(sc.hasNext()) {
			 st=sc.next();
			 names.add(st);
			 
		 }
		
		 String[] student = names.toArray(new String[0]);
		 for(String str: student) {
			 System.out.println(str);
		 }

	}

}



