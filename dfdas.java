import java.util.Scanner;




	

public class dfdas {

public static void print(int result) {
	System.out.println("최종 결과 값 : "+result);
}
	public static void main(String[] args) {
		Scanner Scanner = new Scanner(System.in);
		
		int first = Input.getFirst(Scanner);
		
		int result = first;
		while(true){
			String symbol = Input.getSymbol(Scanner);
			if (symbol.equals("quit")){
				print(result);
				break;
			}
			int second = Input.getSecond(Scanner);
			
			result = Calculate.calculate(result, symbol, second);
	}
}}




