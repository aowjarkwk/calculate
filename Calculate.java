
public class Calculate {
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
		return result;}
}
