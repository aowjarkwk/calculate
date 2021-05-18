import java.util.Scanner;



public class dfdas {
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
public static int calculate(int first, String symbol, int second) {
	int result = 0;
	if(symbol.equals("+")) {
		result=first+second;
		System.out.println("덧셈:" + result);
	}else if(symbol.equals("-")) {
		result=first-second;
		System.out.println("뺄셈:" + result);
	}else if(symbol.equals("*")) {
		result=first*second;
		System.out.println("곱셈:"+result);
	}else if(symbol.equals("/")) {
		result=first/second;
		System.out.println("나눗셈:"+result);
	}else {
		System.out.println("올바른 사칙연산 기호를 입력해주세요.");
	}
	return result;
}
public static void print(int result) {
	System.out.println("최종 결과 값 : "+result);
}
	public static void main(String[] args) {
		Scanner Scanner = new Scanner(System.in);
		
		int first = getFirst(Scanner);
		
		int result = first;
		while(true){
			String symbol = getSymbol(Scanner);
			if (symbol.equals("quit")){
				print(result);
				break;
			}
			int second = getSecond(Scanner);
			
			result = calculate(result, symbol, second);
	}
}}




