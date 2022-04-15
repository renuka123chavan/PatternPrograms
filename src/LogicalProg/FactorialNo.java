package LogicalProg;

public class FactorialNo {

	public static void main(String[] args) {
		int Myno=5;
		int fact=1;
		for(int i=Myno;i>1;i--) {
			fact=fact*i;
		}
   System.out.println("factorial of given no is"+fact);
	}

}
