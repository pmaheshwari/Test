
public class CatchPattern {

	private static final String findPatternIn = "abcabcd";

	public static void main(String[] args) {

		String pattern = CatchPattern.findPattern(findPatternIn);
		System.out.println(pattern);
	}

	public static String findPattern(String findPatternIn) {
		int counter = 2;
		String pattern = "";
		if (findPatternIn == null || findPatternIn.length() < 4) {
			pattern = "";
		} else {

			for (int i = counter; i <= findPatternIn.length() / 2 ; i++) {
				if (findPatternIn.replaceFirst(findPatternIn.substring(0, i), "")
						.contains(findPatternIn.substring(0, i))) {
					pattern = pattern + " " + findPatternIn.substring(0, i);

				}
			}
			
				pattern =  findPattern(findPatternIn.substring(1)+ pattern +  " " );

			
		}

		return pattern;
	}
}
