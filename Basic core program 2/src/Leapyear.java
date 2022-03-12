import java.util.*;
public class Leapyear {
		void leapYear(int year) {
			if(year%400 == 0) {
				System.out.println("Year is leap year");

			}
			else if(year%100 == 0){
				System.out.println("Year is Not leap Year");
			}
			else if(year%4 == 0){
				System.out.println("Year is Leap Year");


				}
			else {
				System.out.println("Year is not Leap year");
			}
		}

		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			Leapyear rv = new Leapyear();
			System.out.println("Enter a Year for Checking leap year");
			int year = scanner.nextInt();
			if(year>999 && year<10000) {
				rv.leapYear(year);
			}
			else {
				System.out.println("Enter 4 Digit year");
			}
		}
	}
