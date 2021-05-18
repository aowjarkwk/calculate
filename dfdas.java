import java.util.Scanner;

public class dfdas {

	public static void main(String[] args) {
		Scanner Scanner = new Scanner(System.in);
		System.out.println(("첫 번째 입력 값 : "));
		int first = Scanner.nextInt();
		System.out.println(("사칙연산 입력 : "));
		String symbol = Scanner.next();
		System.out.println(("두 번째 입력 값 : "));
		int second = Scanner.nextInt();
	if(symbol.equals("+")) {
		System.out.println("덧셈:" + (first+second));
	}else if(symbol.equals("-")) {
		System.out.println("뺄셈:" + (first-second));
	}else if(symbol.equals("*")) {
		System.out.println("곱셈:"+(first*second));
	}else if(symbol.equals("/")) {
		System.out.println("나눗셈:"+(first/second));
	}else {
		System.out.println("올바른 사칙연산 값을 입력해주세요.");
	}
		
	}
}




