import java.util.Scanner;

public class dfdas {

	public static void main(String[] args) {
		Scanner Scanner = new Scanner(System.in);
		System.out.println(("ù ��° �Է� �� : "));
		int first = Scanner.nextInt();
		int result=first;
		
		
		
		while(true) {
		
			System.out.println(("��Ģ���� �Է� : "));
			String symbol = Scanner.next();
			if (symbol.equals("quit")) {
				System.out.println("���� ��� �� : "+result);
				break;}
			System.out.println(("�� ��° �Է� �� : "));
			int second = Scanner.nextInt();	
			if(symbol.equals("+")) {
				result=result+second;
				System.out.println("����:" + result);
			}else if(symbol.equals("-")) {
				result=result-second;
				System.out.println("����:" + result);
			}else if(symbol.equals("*")) {
				result=result*second;
				System.out.println("����:"+result);
			}else if(symbol.equals("/")) {
				result=result/second;
				System.out.println("������:"+result);
			}else {
				System.out.println("�ùٸ� ��Ģ���� ���� �Է����ּ���.");
			}
		}
	
		
	}
}




