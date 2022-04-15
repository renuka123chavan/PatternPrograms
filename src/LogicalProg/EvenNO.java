package LogicalProg;

import java.util.Scanner;

public class EvenNO {

	public static void main(String[] args) {
		//int number=8;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int number=sc.nextInt();
		
		if(number%2==0) {
			System.out.println("no is even");
		}
		else {
			System.out.println("no is odd");
		}

	}

}
