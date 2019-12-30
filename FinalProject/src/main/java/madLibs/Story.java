package madLibs;

public class Story {
	public String testForVowel(String string) {
		if (string.toUpperCase().charAt(0)== 'A'
				||string.toUpperCase().charAt(0)== 'E'
				||string.toUpperCase().charAt(0)== 'I'
				||string.toUpperCase().charAt(0)== 'O'
				||string.toUpperCase().charAt(0)== 'U') {
			return ("an "+string);
		}
		return "a "+string;
	}
}
