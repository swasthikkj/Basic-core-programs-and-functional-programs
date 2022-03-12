import java.util.*;
public class Poweroftwo {
		void power(int num){
			int power;
			for(int i=1; i<=num;i++) {
				power=(int)Math.pow(2, i);
				System.out.println("2 power "+i+" is "+power);
			}

		}
		public static void main(String[] args) {
			Scanner inp = new Scanner(System.in);
			Poweroftwo rv = new Poweroftwo();
			System.out.println("Enter a Number :");
			int num = inp.nextInt();
			if(num<32 && num>0)
			rv.power(num);
		}

	}
