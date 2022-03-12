import java.util.*;
public class Vowel {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = new String();
		System.out.println("Enter the String :");
		str = scanner.nextLine();
		for(int i=0; i<str.length(); i++) {
		if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u') {
			System.out.println("it is vowel");
		}
		else if(str.charAt(i)<'z' && str.charAt(i)>'a'){
			System.out.println("it is consonant");
			}
		}
	}
}