import java.util.*;
public class SwapTwoNumbers {
		void swapNumber(int num1 , int num2) {
			num1 = num1+num2;
			num2 = num1-num2;	
			num1 = num1-num2;
			System.out.println("The number after Swap = "+num1+", number 2 = "+num2);

		}

		public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in) ;
		SwapTwoNumbers rv = new SwapTwoNumbers();
		System.out.println("Enter First Number");
		int num1 = scanner.nextInt();
		System.out.println("Enter Secound Number");
		int num2 = scanner.nextInt();
		System.out.println("Number Before Swap = "+num1+", number 2 = "+num2);
		rv.swapNumber(num1, num2);

	}
}
