
import java.util.Scanner;

public class Java {

	public static void main(String[] args) {
		Scanner scanner_variable = new Scanner (System.in);
		
		int num_01, num_02, total_01;
		num_01 = scanner_variable.nextInt();
		num_02 = scanner_variable.nextInt();
		total_01 = num_01 + num_02;		
		System.out.println(total_01);
		
		double num_03, num_04, total_02;
		num_03 = scanner_variable.nextDouble();
		num_04 = scanner_variable.nextDouble();
		total_02 = num_03 / num_04;
		System.out.println(total_02);
	}

}
