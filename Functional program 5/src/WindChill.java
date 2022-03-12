import java.util.*;
public class WindChill {
		float WindChill(float temperatue , float WindSpeed) {
			float ab = (float)Math.pow(temperatue,0.16);
			return (float)(35.74 + 0.6215*temperatue + (0.4275*temperatue-35.75)*ab);
		}
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			WindChill rv = new WindChill();
			System.out.println("Enter the temperature value");
			int temperature = scanner.nextInt();
			System.out.println("Enter the wind speed value");
			int windSpeed = scanner.nextInt();
			if(temperature < 50 && windSpeed < 120 && windSpeed > 3) {
				System.out.println("Wind Chill is "+rv.WindChill(temperature, windSpeed));
			}
			else {
				System.out.println(" Enter Temerature value less the 50 And Wind Speed Between 3 to 120");
		}
	}
}