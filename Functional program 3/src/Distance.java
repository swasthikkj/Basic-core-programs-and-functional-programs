import java.util.*;
public class Distance {
	 float distanceFormula(int x, int y) {
		 return (float)Math.sqrt(x*x+y*y);
	 }
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			Distance a = new Distance();
			System.out.println("Enter the  value of x");
			int y = scanner.nextInt();
			System.out.println("Enter the value of y");
			int z = scanner.nextInt();
			System.out.println("euclidian distance is "+a.distanceFormula(y,z));
	}
}