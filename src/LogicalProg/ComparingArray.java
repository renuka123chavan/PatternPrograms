package LogicalProg;

import java.util.Arrays;

public class ComparingArray {

	public static void main(String[] args) {
		int arr[]= {10,20,30};
		int arr1[]= {30,45,56};
		int arr2[]= {10,20,30};
		if(Arrays.equals(arr, arr2)) {
			System.out.println("gievn array is equal");
		}else {
			System.out.println("given array is not equal");
		}

	}

}
