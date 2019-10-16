package Function;

public class ReUsableExample {

	public static String testReusability(String s) {
		return FunctionExample.addSomeString.apply(s);
		
	}
	public static void main(String[] args) {

		String result = testReusability("ABC".toLowerCase());
		System.out.println(result);
	}

}
