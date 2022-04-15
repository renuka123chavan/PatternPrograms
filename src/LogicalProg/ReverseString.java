package LogicalProg;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String name=sc.next();
		String rev="";
		for(int i=name.length()-1;i>=0;i--) {
			rev=rev+name.charAt(i);
			
		}
		System.out.println("name string is "+name);
		System.out.println("reverse string is "+rev);

	}

}
