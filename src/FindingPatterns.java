
public class FindingPatterns {
	private static final String myString = "aabaab";

	public static void main(String[] args) {
		String pattern = "";
		boolean hasPattern = false;
		for (int i = 1; i <= myString.length() / 2; i++) {
			int index = myString.substring(i).indexOf(myString.charAt(0)) + i - 1;
			hasPattern = FindingPatterns.findPattern(myString, pattern, index);
			if (hasPattern) {
				break;
			}
		}
		System.out.println(hasPattern);

	}

	public static boolean findPattern(String str, String pattern, int index) {

		boolean hasPattern = false;
		if (!pattern.equals("")) {
			if (str.equalsIgnoreCase(pattern))
				return true;
			else if (pattern.length() > str.length()) {
				return false;
			} else if (str.length() % pattern.length() == 0) {
				index = -1;
			} else
				return false;

		}
		if (index != -1 && pattern.equals("")) {
			pattern = str.substring(0, index + 1);
			
		}
		if(pattern.length() == 0){
			return hasPattern;
		}
		if (str.length() % pattern.length() == 0) {
			hasPattern = str.substring(index + 1).contains(pattern);
			int newIndex = pattern.length();
			String newString = str.substring(newIndex);
			if (newString != null && !newString.equals("")) {
				hasPattern = findPattern(newString, pattern, index);

			}
		}

		return hasPattern;
	}
}
