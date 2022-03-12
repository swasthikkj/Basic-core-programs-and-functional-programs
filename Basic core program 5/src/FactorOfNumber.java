import java.util.*;
public class FactorOfNumber {
	
		void factor(int num) {
			int a;

			 for (int i = 2; i <= num; i++) {

		            while (num % i == 0) {
		                System.out.print(i + " ");
		                num = num / i;
		            }
		        }
		}
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			FactorOfNumber rv=new FactorOfNumber();
			System.out.println("Enter the Number Whose Factors you need");
			int num = scanner.nextInt();
			rv.factor(num);

	}
}
