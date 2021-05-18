
public class Calculate {
	public static int calculate(int first, String symbol, int second) {
		int result = 0;
		if(symbol.equals("+")) {
			result=first+second;
			System.out.println("µ¡¼À:" + result);
		}else if(symbol.equals("-")) {
			result=first-second;
			System.out.println("»¬¼À:" + result);
		}else if(symbol.equals("*")) {
			result=first*second;
			System.out.println("°ö¼À:"+result);
		}else if(symbol.equals("/")) {
			result=first/second;
			System.out.println("³ª´°¼À:"+result);
		}else {
			System.out.println("¿Ã¹Ù¸¥ »çÄ¢¿¬»ê ±âÈ£¸¦ ÀÔ·ÂÇØÁÖ¼¼¿ä.");
		}
		return result;}
}
