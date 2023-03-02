package alfaLab_Assesment;

public class Q_no_06 {

  public static void main(String[] args) {
			
			int i, j ,k;
			for(i=1;i<=4;i++) {
				for(j=4;j>=i;j--) {
					System.out.print(" ");//print space
				} 
				for(j=1;j<=i;j++) {
					System.out.print("*");//print star
				}
				for(k=2;k<=i;k++) {
					System.out.print("*");//print star
				}
				System.out.println();
			}
			
		
		}
  
}
