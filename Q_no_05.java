package alfaLab_Assesment;
//5. write a program to show the different between "continue" and "break"

public class Q_no_05 {

	public static void main(String[] args) {
		Continue();
		Break();
	}
	
	public static  void Continue() {
		 System.out.println("Program with Continue");
		 int i=0;
		 while(i<5) {
			 
			 if(i==3) {
				 i++;
				 continue;// Continue is the keyword which jump from the given condition to next .
			 }
			 System.out.println(i++);
		 }
	}
	
	public static void Break() {
		System.out.println("Program with Break");
		int i=0;
		while(i<5) {
			if(i==3) {
				i++;
				break;//Break is the keyword which is stop the execution of the program at given condition 
			}
			System.out.println(i++);
		}
	}

	
}
