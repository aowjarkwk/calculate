import java.util.Scanner;

public class StringCalculator {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("����� �� �Է� : ");
		
		String value = scanner.nextLine();
		System.out.println("�Է� �� :" + value);
		
		String[] values = value.split(" ");
		
		int first = Integer.parseInt(values[0]);
		
		int result = first;
		for (int i = 1;i<values.length; i = i + 2) {
			String symbol = values[i];
			System.out.println("symbol : "+ symbol);
			int second = Integer.parseInt(values[i+1]);
		result = Calculate.calculate(result, symbol, second);
		}
		dfdas.print(result);
	}
}
