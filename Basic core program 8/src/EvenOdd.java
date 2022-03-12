import java.util.*;
public class EvenOdd {
		void evenOrOdd(int num) {
			if(num%2 == 0) {
				System.out.println("Even number");
			}
			else {
				System.out.println("Odd number");
			}
		}

		public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		EvenOdd rv = new EvenOdd();
		System.out.println("Enter the Number : ");
		int number = scanner.nextInt();
		rv.evenOrOdd(number);

	}

}
