package LogicalProg;

import java.util.Scanner;

public class NoOfWhitspaceCount {

	public static void main(String[] args) {
		//Scanner sc=new Scanner(System.in);
		//System.out.println("Enter a string");
		//String str=sc.next();
		String str="r nu k a";
		int count=0;
		
		for(int i=0;i<=str.length()-1;i++) {
			char ch=str.charAt(i);
			if(ch==' ') {
				count++;
			}
		}
  System.out.println("count of whitespace "+count);
	}

}
