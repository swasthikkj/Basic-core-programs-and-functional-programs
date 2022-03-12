import java.util.*;
public class Quadratic {
		void QuadraticFormula(float a,float b,float c) {
			float root1;
			float root2;
			float delta = (float)b*b-4*a*c;
			if(delta>0.0) {
				 root1 = (float) (-b + (Math.pow(delta, 0.5)) / 2.0 * a); 
				 root2 = (float) (-b - (Math.pow(delta, 0.5)) / 2.0 * a);  
				System.out.println("Root 1 of equation is "+root1);
				System.out.println("Root 2 of equation is "+root2);
			}
			else if(delta == 0.0) {
				root1 = (float) ((float) -b/(2.0*a));
			}
	else if(delta < 0.0) {
				float sqrtval = (float) ((float) Math.sqrt((float) Math.abs(delta)));
				System.out.println("Roots are not real");
				System.out.println(-(double)b / (2 * a) + " + i"+ sqrtval + "\n"+ -(double)b / (2 * a)+ " - i" + sqrtval);  
			}
		}
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			Quadratic rv = new Quadratic();
			System.out.println("Enter value of a");
			float a = scanner.nextFloat();
			System.out.println("Enter value of b");
			float b = scanner.nextFloat();
			System.out.println("Enter value of c");
			float c = scanner.nextFloat();
			rv.QuadraticFormula(a, b, c);
	}
}
