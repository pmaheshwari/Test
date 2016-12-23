public class TestClass {
	public static void main(String[] args) {
		String toReverse = "My name is Priyanka";
		String reversed = "";
		String reversedUnit = "";
		String[] arrayStrings = toReverse.split(" ");

		
		for (int i = 0; i < arrayStrings.length; i++) {
			reversedUnit = reverseUsingStack(arrayStrings[i]);
			reversed = reversed + " " + reversedUnit;
		}

		System.out.println(reversed);

	}

	private static String reverse(String string) {
		if (string == null || string.length() == 1) {
			return string;
		} else {
			return reverse(string.substring(1)) + string.charAt(0);
		}
	}
	private static String reverseUsingStack(String string){
		MyStack stack = new MyStack();
		String reversed = "";
		if (string == null || string.length() == 1) {
			return string;
		} else {
			char[] charArr = string.toCharArray();
			for( int i = 0; i< charArr.length; i++ ){
				stack.push(charArr[i]);
				
			}
			for( int i = 0; i< charArr.length; i++ ){
				reversed = reversed + stack.pop();
			}
			return reversed;
		}
		
	}
}
