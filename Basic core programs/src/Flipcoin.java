import java.util.*;
public class Flipcoin {
	
			void flipCoin(int num) {
				float head = 0;
				float tail = 0;
				float percentOfHead;
				float percentOfTail;
				Random random = new Random();
				
				for(int i=0; i<num; i++) {
					int randomNum = random.nextInt(2);
					if(randomNum > 0.5) {
						head++;
						
					}
					else if(randomNum < 0.5) {
						tail++;
					}
				}
				float total = head+tail;
				percentOfHead = head/total*100;
				percentOfTail = tail/total*100;
				System.out.println("Percentage of head= "+percentOfHead+"%");
				System.out.println("Percentage of tails= "+percentOfTail+"%");
					
				}	
			public static void main(String[] args) {
				Scanner scanner = new Scanner(System.in);
				Flipcoin rv=new Flipcoin();
				System.out.println("Enter the number of Flip you want");
				int num = scanner.nextInt();
			    rv.flipCoin(num);
				
			}

		}

		