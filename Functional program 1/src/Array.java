import java.util.Scanner;
public class Array {
	public static void main(String[] args) {
		Array a = new Array();
		System.out.println("Enter the Number of rows");
		int row = scanner.nextInt();
		System.out.println("Enter the Number of column");
		int column = scanner.nextInt();
		a.Array2D(row,column);
		}
	static Scanner scanner = new Scanner(System.in);
	void Array2D(int row, int column) {

	    int[][] integerArray=new int[row][column];
	      for(int i=0; i<row; i++) {
			for(int j=0; j<column; j++) {
				integerArray[i][j] = scanner.nextInt();
			}
		}
			for(int i=0; i<row; i++) {
				for(int j=0; j<column; j++) {
					System.out.print(" "+integerArray[i][j]);
					}
				System.out.println();
		}
	}
}