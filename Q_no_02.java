package alfaLab_Assesment;
//2.sort the array in ascending order and print the array.

import java.util.Scanner;

public class Q_no_02 {
	
	public static void main(String[] args) {
		
		int i,j,size,temp;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter Array size:");
		size = sc.nextInt();
		int num[] = new int [size];
		System.out.println();
		
		System.out.println("Enter the numbers:");
		for(i=0;i<size;i++) {
			
			System.out.print(i+1+".Number:");
			num[i] = sc.nextInt();
		
		}
		int	index;
		for(i=0;i<num.length;i++) {
			index=i;
			for(j=i;j<=num.length-1;j++) {
				if(num[j]<num[index]) {
					index=j;
				}
			}
			
			temp=num[i];
			num[i]=num[index];
			num[index]=temp;
		}
		System.out.println();
		System.out.println("Ascending order of the given numbers:"); 
		for(i=0;i<num.length;i++) {
			
			System.out.println(num[i]);
		
		}

	}


}
