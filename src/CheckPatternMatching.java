
import java.util.ArrayList;
import java.util.List;

public class CheckPatternMatching {

	public Boolean checkMatchingPattern(String s) {

		String[] StringChars = s.split("");
		List<Boolean> totalPatternMatchList = new ArrayList<Boolean>();

		String pattern = "";
		String totalPatterns[] = new String[s.length() + 1];
		for (int i = 0; i < StringChars.length; i++) {
			pattern = pattern.concat(StringChars[i]);
			totalPatterns[i] = pattern;
		}
		for (int j = 1; j <= StringChars.length - 2; j++) {
			List<Boolean> subPatternMatchList = new ArrayList<Boolean>();
			for (int k = 0; k < StringChars.length - 1; k = k + j) {
				String subString = "";
				if (k + j <= s.length())
					subString = s.substring(k, k + j);
				else
					subString = s.substring(k, s.length());
				subPatternMatchList
						.add(totalPatterns[j].equals(subString) ? Boolean.TRUE
								: Boolean.FALSE);
			}
			totalPatternMatchList.add(subPatternMatchList
					.contains(Boolean.FALSE) ? Boolean.FALSE : Boolean.TRUE);
		}
		if (totalPatternMatchList.contains(Boolean.TRUE))
			return Boolean.TRUE;
		return Boolean.FALSE;
	}

	public static void main(String[] args) {
		String s = "abaaba";
		CheckPatternMatching patternMatching = new CheckPatternMatching();
		System.out.println("String pattern to match : " + s);
		System.out.println("Pattern matched : "
				+ patternMatching.checkMatchingPattern(s));
	}
}