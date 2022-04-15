package LogicalProg;

public class PrimeNo {

	public static void main(String[] args) {
		int num=6;
		int count=0;
		for(int i=2;i<num;i++) {
			if(num%i==0)
			{
				count++;
				break;
			}
		}
			if(count==1) {
				System.out.println("no is not primeNo");
			}else {
				System.out.println("no is Prime no");
			}
		}

	

}
