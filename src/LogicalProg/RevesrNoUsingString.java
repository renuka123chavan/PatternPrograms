package LogicalProg;

import java.util.Scanner;

public class RevesrNoUsingString {

	private static int MyrevNo;

	public static void main(String[] args) {
		int num=1234;
		String OriNo=Integer.toString(num);
		String rev="";
		for(int i=OriNo.length()-1;i>=0;i--) {
			rev=rev+OriNo.charAt(i);
		}
		MyrevNo=Integer.parseInt(rev);
		System.out.println("reverser number is "+MyrevNo);

	}

}
