import java.util.*;
public class Remainder {
		void Formula(int dividend , int divisor) {
			System.out.println("Remainder is "+dividend%divisor);
			System.out.println("Quotient is "+dividend/divisor);
		}

		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			Remainder rv=new Remainder();
			System.out.println("Enter the Dividend");
			int dividend = scanner.nextInt();
			System.out.println("Enter the Divisor");
			int divisor = scanner.nextInt();
			rv.Formula(dividend,divisor);
	}

}
