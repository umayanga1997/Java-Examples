
import java.util.Scanner;

public class Java {

	public static void main(String[] args) {
		
		Scanner scanner_variable = new Scanner(System.in);
		
		int x;
		int y;
		int z;
		
		x = scanner_variable.nextInt();
		y = scanner_variable.nextInt();
		
		z = x + y;
		
		System.out.println(z);

	}

}
