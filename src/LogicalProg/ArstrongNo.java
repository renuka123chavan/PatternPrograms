package LogicalProg;

public class ArstrongNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int num=153;
     int add=0;
     for(int i=num;i>0;i=i/10) {
    	 int rem=i%10;
    	 add=add+(rem*rem*rem);
     }
     System.out.println("sum is "+add);
     if(num==add) {
    	 System.out.println("no is armstrong ");
     }else {
    	 System.out.println("no is not armstrong");
     }
	}

}
