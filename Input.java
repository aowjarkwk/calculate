import java.util.Scanner;

public class Input {
	public static int getFirst(Scanner Scanner) {
		
		System.out.println(("첫 번째 입력 값 : "));
		int first = Scanner.nextInt();
		return first;
	}
	public static String getSymbol(Scanner Scanner) {
		System.out.println("사칙연산 기호 : ");
		String symbol = Scanner.next();
		return symbol;
	}
	public static int getSecond(Scanner Scanner) {
		System.out.println(("두 번째 입력 값 : "));
		int second = Scanner.nextInt();	
		return second;
}
	}
