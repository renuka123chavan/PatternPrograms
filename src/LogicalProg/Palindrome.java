package LogicalProg;

public class Palindrome {

	public static void main(String[] args) {
		String oriString="nayan";
		String rev="";
		for(int i=oriString.length()-1;i>=0;i--) {
			rev=rev+oriString.charAt(i);
		}
		System.out.println("original string "+oriString);
		System.out.println("reverse string "+rev);
		if(oriString.equals(rev)) {
			System.out.println("string ispalindrome");
		}else {
			System.out.println("string is not palindrome");
		}

	}

}
