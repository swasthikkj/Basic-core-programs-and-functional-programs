import java.util.*;
public class Sum {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of array");
		  int size = scanner.nextInt();
		  int[] Array = new int[size];
		  System.out.println("Enter the element of array");
		  for(int i=0; i<size; i++) {
			  Array[i] = scanner.nextInt();
			  }
	for (int i=0; i < Array.length; i++) {
	          for (int j=i+1; j<Array.length; j++) {
	              for (int k=j+1; k<Array.length; k++) {
	                  if (Array[i] + Array[j] + Array[k] == 0) {
	                      System.out.println("Numbers found : " + Array[i] + "," + Array[j] + " and " + Array[k]);
	                  }
	              }
	          }
	     }
	}
}
