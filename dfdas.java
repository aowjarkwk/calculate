import java.util.Scanner;

public class dfdas {

	public static void main(String[] args) {
		Scanner Scanner = new Scanner(System.in);
		System.out.println(("첫 번째 입력 값 : "));
		int first = Scanner.nextInt();
		int result=first;
		
		
		
		while(true) {
		
			System.out.println(("사칙연산 입력 : "));
			String symbol = Scanner.next();
			if (symbol.equals("quit")) {
				System.out.println("최종 결과 값 : "+result);
				break;}
			System.out.println(("두 번째 입력 값 : "));
			int second = Scanner.nextInt();	
			if(symbol.equals("+")) {
				result=result+second;
				System.out.println("덧셈:" + result);
			}else if(symbol.equals("-")) {
				result=result-second;
				System.out.println("뺄셈:" + result);
			}else if(symbol.equals("*")) {
				result=result*second;
				System.out.println("곱셈:"+result);
			}else if(symbol.equals("/")) {
				result=result/second;
				System.out.println("나눗셈:"+result);
			}else {
				System.out.println("올바른 사칙연산 값을 입력해주세요.");
			}
		}
	
		
	}
}




