import java.util.Scanner;

public class dfdas {

	public static void main(String[] args) {
		Scanner Scanner = new Scanner(System.in);
		System.out.println(("ù ��° �Է� �� : "));
		int first = Scanner.nextInt();
		System.out.println(("��Ģ���� �Է� : "));
		String symbol = Scanner.next();
		System.out.println(("�� ��° �Է� �� : "));
		int second = Scanner.nextInt();
	if(symbol.equals("+")) {
		System.out.println("����:" + (first+second));
	}else if(symbol.equals("-")) {
		System.out.println("����:" + (first-second));
	}else if(symbol.equals("*")) {
		System.out.println("����:"+(first*second));
	}else if(symbol.equals("/")) {
		System.out.println("������:"+(first/second));
	}else {
		System.out.println("�ùٸ� ��Ģ���� ���� �Է����ּ���.");
	}
		
	}
}




