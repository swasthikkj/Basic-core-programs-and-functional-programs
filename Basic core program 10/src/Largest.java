import java.util.*;
public class Largest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Largest rv = new Largest();
		System.out.println("Enter First Number");
		int num1 = scanner.nextInt();
		System.out.println("Enter Secound Number");
		int num2 = scanner.nextInt();
		System.out.println("Enter third Number");
		int num3 = scanner.nextInt();
		rv.Largest(num1,num2,num3);
}

		void Largest(int num1,int num2,int num3) {
			if(num1>num2 && num1>num3) {
				System.out.println("Largest Number is "+num1);
			}
			else if(num2 > num1 && num2 > num3) {
				System.out.println("Largest Number is "+num2);
			}
			else {
				System.out.println("Largest Number is "+num3);
			}

		}
}
		