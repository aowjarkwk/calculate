import java.util.Scanner;



public class dfdas {
public static int getFirst(Scanner Scanner) {
	
	System.out.println(("ù ��° �Է� �� : "));
	int first = Scanner.nextInt();
	return first;
}
public static String getSymbol(Scanner Scanner) {
	System.out.println("��Ģ���� ��ȣ : ");
	String symbol = Scanner.next();
	return symbol;
}
public static int getSecond(Scanner Scanner) {
	System.out.println(("�� ��° �Է� �� : "));
	int second = Scanner.nextInt();	
	return second;

}
public static int calculate(int first, String symbol, int second) {
	int result = 0;
	if(symbol.equals("+")) {
		result=first+second;
		System.out.println("����:" + result);
	}else if(symbol.equals("-")) {
		result=first-second;
		System.out.println("����:" + result);
	}else if(symbol.equals("*")) {
		result=first*second;
		System.out.println("����:"+result);
	}else if(symbol.equals("/")) {
		result=first/second;
		System.out.println("������:"+result);
	}else {
		System.out.println("�ùٸ� ��Ģ���� ��ȣ�� �Է����ּ���.");
	}
	return result;
}
public static void print(int result) {
	System.out.println("���� ��� �� : "+result);
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




