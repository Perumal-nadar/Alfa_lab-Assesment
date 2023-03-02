package alfaLab_Assesment;

public class Q_no_4 {

  public static void main(String[] args) {
	      Scanner scanner = new Scanner(System.in);
	      HashMap<Integer, Integer> map = new HashMap<>();

	        for (int i = 0; i < 20; i++) {
	            System.out.print("Enter a number between 0 and 9: ");
	            int num = scanner.nextInt();

	            while (num < 0 || num > 9) {
	                System.out.println("Invalid input. Please enter a number between 0 and 9.");
	                num = scanner.nextInt();
	            }

	            if (map.containsKey(num)) {
	                map.put(num, map.get(num) + 1);
	            } 
	            else {
	                map.put(num, 1);
	            }
	        }

	        System.out.println("Number Counts:");
	        for (int key : map.keySet()) {
	            System.out.println(key + ": " + map.get(key));
	        }
	    
	}
  
}
